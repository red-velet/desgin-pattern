package creativeDesignPattern.abstractFactory.product.impl;

import creativeDesignPattern.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class HttpVideoResource extends AbstractPictureResource {
    public HttpVideoResource() {
        super();
    }

    public HttpVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
