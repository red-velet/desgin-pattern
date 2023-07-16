package creativeDesignPattern.abstractFactory.factory.impl;

import creativeDesignPattern.abstractFactory.factory.AbstractResourceFactory;
import creativeDesignPattern.abstractFactory.product.AbstractPictureResource;
import creativeDesignPattern.abstractFactory.product.AbstractTextResource;
import creativeDesignPattern.abstractFactory.product.AbstractVideoResource;
import creativeDesignPattern.abstractFactory.product.impl.FilePictureResource;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class FileResourceFactory extends AbstractResourceFactory {
    @Override
    public AbstractPictureResource create(String url) {
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        //很复杂的逻辑......
        return new FilePictureResource(url);
    }

    @Override
    public AbstractPictureResource loadPicture(String url) {
        return null;
    }

    @Override
    public AbstractVideoResource loadVideo(String url) {
        return null;
    }

    @Override
    public AbstractTextResource loadText(String url) {
        return null;
    }
}
