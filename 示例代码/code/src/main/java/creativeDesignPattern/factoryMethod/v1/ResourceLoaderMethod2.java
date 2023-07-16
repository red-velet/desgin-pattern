package creativeDesignPattern.factoryMethod.v1;

import creativeDesignPattern.factoryMethod.v1.impl.DefaultResourceFactory;
import creativeDesignPattern.factoryMethod.v1.impl.FileResourceFactory;
import creativeDesignPattern.factoryMethod.v1.impl.HttpResourceFactory;
import creativeDesignPattern.simpleFactory.ResourceLoadException;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: 工厂方法设计模式-但是还不满足
 */
public class ResourceLoaderMethod2 {
    private IResourceFactory resourceFactory;

    private Resource load(String url) {
        //1.根据前缀匹配
        String prefix = getPrefix(url);
        if (prefix.equals("http")) {
            resourceFactory = new HttpResourceFactory();
        } else if (prefix.equals("file")) {
            resourceFactory = new FileResourceFactory();
        } else {
            resourceFactory = new DefaultResourceFactory();
        }
        return resourceFactory.create(url);
    }

    private String getPrefix(String url) {
        if (url == null || "".equals(url) || url.contains(":")) {
            throw new ResourceLoadException("url不合法");
        }
        String[] split = url.split(":");
        return split[0];
    }
}
