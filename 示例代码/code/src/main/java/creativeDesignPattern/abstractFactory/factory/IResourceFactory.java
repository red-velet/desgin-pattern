package creativeDesignPattern.abstractFactory.factory;

import creativeDesignPattern.abstractFactory.product.AbstractPictureResource;
import creativeDesignPattern.abstractFactory.product.AbstractTextResource;
import creativeDesignPattern.abstractFactory.product.AbstractVideoResource;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public interface IResourceFactory {
    public AbstractPictureResource create(String url);

    /**
     * 加载图片资源的工厂方法
     *
     * @param url 给的的资源url
     * @return 图片资源
     */
    public AbstractPictureResource loadPicture(String url);

    /**
     * 加载视频资源的工厂方法
     *
     * @param url 给的的资源url
     * @return 视频资源
     */
    public AbstractVideoResource loadVideo(String url);

    /**
     * 加载文本资源的工厂方法
     *
     * @param url 给的的资源url
     * @return 文本资源
     */
    public AbstractTextResource loadText(String url);
}
