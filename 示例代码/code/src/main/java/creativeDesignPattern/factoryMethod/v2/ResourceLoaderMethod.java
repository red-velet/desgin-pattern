package creativeDesignPattern.factoryMethod.v2;

import creativeDesignPattern.factoryMethod.v2.impl.HttpResourceFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: 工厂方法设计模式-版本2-新增缓存-但是还是需要修改源代码
 */
public class ResourceLoaderMethod {
    private IResourceFactory resourceFactory;
    private static Map<String, IResourceFactory> resourceFactoryCache = new HashMap<>(8);

    static {
        resourceFactoryCache.put("http", new HttpResourceFactory());
        resourceFactoryCache.put("file", new HttpResourceFactory());
        resourceFactoryCache.put("default", new HttpResourceFactory());
    }

    private Resource load(String url) {
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
}
