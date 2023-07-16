package creativeDesignPattern.abstractFactory.product;

import lombok.Data;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
@Data
public abstract class AbstractVideoResource implements IResource {
    private String url;

    public AbstractVideoResource() {
    }

    public AbstractVideoResource(String url) {
        this.url = url;
    }

    public void transformMp4() {
        System.out.println("视频资源组共有方法-transformMp4()");
    }
}
