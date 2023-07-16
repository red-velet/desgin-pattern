package structuralDesignPattern.decorator;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("这是具体的对象");
    }
}
