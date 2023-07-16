package creativeDesignPattern.abstractFactory.product.impl;

import creativeDesignPattern.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class DefaultVideoResource extends AbstractVideoResource {
    @Override
    public InputStream getInputStream() {
        return null;
    }
}
