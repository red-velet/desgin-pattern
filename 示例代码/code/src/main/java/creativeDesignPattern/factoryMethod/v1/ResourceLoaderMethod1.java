package creativeDesignPattern.factoryMethod.v1;

/**
 * Author: shawn
 * createTime: 2023/7/6
 * Description: No Description
 */
public class ResourceLoaderMethod1 {
    private IResourceFactory resourceFactory;

    public void setResourceFactory(IResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    private Resource load(String url) {
        return resourceFactory.create(url);
    }
}
