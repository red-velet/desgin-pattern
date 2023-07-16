package creativeDesignPattern.factoryMethod.v2.impl;

import creativeDesignPattern.factoryMethod.v2.IResourceFactory;
import creativeDesignPattern.factoryMethod.v2.Resource;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class DefaultResourceFactory implements IResourceFactory {
    @Override
    public Resource create(String url) {
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        return new Resource(url);
    }
}
