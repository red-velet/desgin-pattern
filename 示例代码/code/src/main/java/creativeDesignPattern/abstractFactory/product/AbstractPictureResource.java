package creativeDesignPattern.abstractFactory.product;

import lombok.Data;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
@Data
public abstract class AbstractPictureResource implements IResource {
    private String url;

    public AbstractPictureResource() {
    }

    public AbstractPictureResource(String url) {
        this.url = url;
    }

    public void transformJpg() {
        System.out.println("图片资源组共有方法-transformJpg()");
    }
}
