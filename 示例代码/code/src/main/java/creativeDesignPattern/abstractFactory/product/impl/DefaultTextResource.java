package creativeDesignPattern.abstractFactory.product.impl;

import creativeDesignPattern.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class DefaultTextResource extends AbstractTextResource {
    @Override
    public InputStream getInputStream() {
        return null;
    }
}
