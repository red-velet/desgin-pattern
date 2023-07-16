package creativeDesignPattern.simpleFactory;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class ResourceLoader {
    private Resource load(String url) {
        //1.根据前缀匹配
        String prefix = getPrefix(url);
//        if (prefix.equals("http")) {
//            //很复杂的操作,可能此处会执行很久
//            return new Resource(url);
//        } else if (prefix.equals("file")) {
//            //很复杂的操作,可能此处会执行很久
//            return new Resource(url);
//        } else if (prefix.equals("classpath")) {
//            //很复杂的操作,可能此处会执行很久
//            return new Resource(url);
//        } else {
//            return new Resource("default");
//        }

        //使用简单工厂模式,不将创建资源的过程耦合到此处代码
        return ResourceLoadFactory.create(prefix, url);
    }

    private String getPrefix(String url) {
        if (url == null || "".equals(url) || url.contains(":")) {
            throw new ResourceLoadException("url不合法");
        }
        String[] split = url.split(":");
        return split[0];
    }
}
