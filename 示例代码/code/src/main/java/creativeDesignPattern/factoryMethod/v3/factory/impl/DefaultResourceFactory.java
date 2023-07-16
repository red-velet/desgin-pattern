package creativeDesignPattern.factoryMethod.v3.factory.impl;

import creativeDesignPattern.factoryMethod.v3.factory.IResourceFactory;
import creativeDesignPattern.factoryMethod.v3.product.AbstractResource;
import creativeDesignPattern.factoryMethod.v3.product.impl.DefaultResource;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class DefaultResourceFactory implements IResourceFactory {
    @Override
    public AbstractResource create(String url) {
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        return new DefaultResource(url);
    }
}
