package creativeDesignPattern.factoryMethod.v3.product.impl;

import creativeDesignPattern.factoryMethod.v3.product.AbstractResource;

import java.io.InputStream;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class FileResource extends AbstractResource {
    public FileResource() {
        super();
    }

    public FileResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
