package creativeDesignPattern.simpleFactory;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class ResourceLoadException extends RuntimeException {
    public ResourceLoadException() {
        super();
    }

    public ResourceLoadException(String message) {
        super(message);
    }
}
