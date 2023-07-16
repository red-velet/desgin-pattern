package creativeDesignPattern.factoryMethod.v3;

import creativeDesignPattern.factoryMethod.v3.factory.IResourceFactory;
import creativeDesignPattern.factoryMethod.v3.product.AbstractResource;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: 工厂方法设计模式-版本2-新增缓存-但是还是需要修改源代码
 */
@Slf4j
public class ResourceLoaderMethod {
    private IResourceFactory resourceFactory;
    private static Map<String, IResourceFactory> resourceFactoryCache = new HashMap<>(8);

    static {
        //在类加载的时候/起一个定时器,定时读取配置文件
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("resourceFactory.properties");
        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> next = iterator.next();
            String prefixKey = next.getKey().toString();
            String className = next.getValue().toString();
            log.info("key is {}", prefixKey);
            log.info("value is {}", className);
            log.info("-----------------------");
            Class<?> clazz = null;
            try {
                clazz = Class.forName(className);
                IResourceFactory instance = (IResourceFactory) clazz.getConstructor().newInstance();
                resourceFactoryCache.put(prefixKey, instance);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                     InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private AbstractResource load(String url) {
        String prefix = getPrefix(url);
        return resourceFactoryCache.get(prefix).create(url);
    }

    private String getPrefix(String url) {
        if (url == null || "".equals(url) || url.contains(":")) {
            return "default";
        }
        String[] split = url.split(":");
        return split[0];
    }

    public static void main(String[] args) {
        ResourceLoaderMethod rlm = new ResourceLoaderMethod();
        AbstractResource load = rlm.load("file:user/inter");
        System.out.println("load.getUrl() = " + load.getUrl());
    }
}
