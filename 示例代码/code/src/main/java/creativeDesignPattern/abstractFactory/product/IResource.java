package creativeDesignPattern.abstractFactory.product;

import java.io.InputStream;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public interface IResource {
    //子类都要实现的方法
    InputStream getInputStream();
}
