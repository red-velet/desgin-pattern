package creativeDesignPattern.abstractFactory.product.impl;

import creativeDesignPattern.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class DefaultPictureResource extends AbstractPictureResource {
    public DefaultPictureResource() {
        super();
    }

    public DefaultPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
