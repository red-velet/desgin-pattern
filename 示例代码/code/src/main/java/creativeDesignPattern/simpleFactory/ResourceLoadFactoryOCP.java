package creativeDesignPattern.simpleFactory;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: 遵循开闭原则的工厂
 */
public interface ResourceLoadFactoryOCP {
    public Resource create(String type, String url);
}
