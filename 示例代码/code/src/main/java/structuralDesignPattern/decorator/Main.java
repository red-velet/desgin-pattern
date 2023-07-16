package structuralDesignPattern.decorator;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class Main {
    public static void main(String[] args) {
        //创建一个原始对象
        Component component = new ConcreteComponent();
        //没有包装，调用原始方法
        component.operation();
        System.out.println("----------分-----------界------------线--------------");
        //同A包装一下
        Decorator decorator = new DecoratorA(component);
        decorator.operation();
        System.out.println("----------分-----------界------------线--------------");
        //同B再包装一层
        decorator = new DecoratorB(decorator);
        decorator.operation();
        System.out.println("----------分-----------界------------线--------------");
        //再次调用原有对象，并没有发生改变
        component.operation();
    }
}
