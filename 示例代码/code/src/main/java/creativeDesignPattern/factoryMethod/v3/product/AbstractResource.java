package creativeDesignPattern.factoryMethod.v3.product;

import lombok.Data;

import java.io.InputStream;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
@Data
public abstract class AbstractResource {
    private String url;

    public AbstractResource() {
    }

    public AbstractResource(String url) {
        this.url = url;
    }

    //子类都要实现的方法
    public abstract InputStream getInputStream();
}
