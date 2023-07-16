package structuralDesignPattern.decorator;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class DecoratorA extends Decorator {
    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("包装了一下,添加了背景颜色");
        super.operation();
    }
}
