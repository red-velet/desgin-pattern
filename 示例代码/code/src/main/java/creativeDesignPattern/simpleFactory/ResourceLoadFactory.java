package creativeDesignPattern.simpleFactory;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class ResourceLoadFactory {
    public static Resource create(String type, String url) {
        if (type.equals("http")) {
            //很复杂的操作,可能此处会执行很久
            return new Resource(url);
        } else if (type.equals("file")) {
            //很复杂的操作,可能此处会执行很久
            return new Resource(url);
        } else if (type.equals("classpath")) {
            //很复杂的操作,可能此处会执行很久
            return new Resource(url);
        } else {
            return new Resource("default");
        }
    }
}
