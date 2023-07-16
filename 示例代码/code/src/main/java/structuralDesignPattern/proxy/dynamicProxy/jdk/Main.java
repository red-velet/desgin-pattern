package structuralDesignPattern.proxy.dynamicProxy.jdk;

import java.lang.reflect.Proxy;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class Main {
    public static void main(String[] args) {
        // 创建目标对象
        DataBase target = new DataBaseImpl();

        // 创建代理处理器
        DatabaseInvocationHandler handler = new DatabaseInvocationHandler();

        // 创建代理对象
        DataBase proxy = (DataBase) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );

        // 调用代理对象的方法
        String queryResult = proxy.query("SELECT * FROM table");
        System.out.println("------------------------");
        String deleteResult = proxy.delete("DELETE FROM table WHERE id = 1");
        System.out.println("------------------------");


        // 输出方法的返回结果
        System.out.println("Query Result: " + queryResult);
        System.out.println("------------------------");
        System.out.println("Delete Result: " + deleteResult);
    }
}