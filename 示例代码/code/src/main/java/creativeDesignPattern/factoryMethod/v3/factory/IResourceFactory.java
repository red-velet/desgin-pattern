package creativeDesignPattern.factoryMethod.v3.factory;

import creativeDesignPattern.factoryMethod.v3.product.AbstractResource;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public interface IResourceFactory {
    public AbstractResource create(String url);
}
