package structuralDesignPattern.decorator;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
