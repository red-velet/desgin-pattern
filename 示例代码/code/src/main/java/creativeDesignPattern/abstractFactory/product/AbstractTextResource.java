package creativeDesignPattern.abstractFactory.product;

import lombok.Data;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
@Data
public abstract class AbstractTextResource implements IResource {
    private String url;

    public AbstractTextResource() {
    }

    public AbstractTextResource(String url) {
        this.url = url;
    }

    public void transformUtf8() {
        System.out.println("文本资源组共有方法-transformUtf8()");
    }
}
