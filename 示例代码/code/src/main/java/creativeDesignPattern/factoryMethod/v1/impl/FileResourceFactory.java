package creativeDesignPattern.factoryMethod.v1.impl;

import creativeDesignPattern.factoryMethod.v1.IResourceFactory;
import creativeDesignPattern.factoryMethod.v1.Resource;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class FileResourceFactory implements IResourceFactory {
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
