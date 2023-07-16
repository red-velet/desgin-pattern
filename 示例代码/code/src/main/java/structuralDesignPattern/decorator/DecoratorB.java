package structuralDesignPattern.decorator;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class DecoratorB extends Decorator {
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("包装了一下,打了个合格标签");
        super.operation();
    }
}
