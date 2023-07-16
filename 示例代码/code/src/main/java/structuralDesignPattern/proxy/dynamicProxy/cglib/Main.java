package structuralDesignPattern.proxy.dynamicProxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class Main {
    public static void main(String[] args) {
        //cglib通过enhancer
        Enhancer enhancer = new Enhancer();
        //设置他的父类-要继承谁,给谁做代理
        enhancer.setSuperclass(DataBaseImpl.class);
        //设置方法拦截器,用于拦截方法,对方法做增强
        enhancer.setCallback(new DatabaseMethodInterceptor());
        // 创建代理对象
        DataBaseImpl proxy = (DataBaseImpl) enhancer.create();
        // 调用代理对象的方法
        String queryResult = proxy.query("SELECT * FROM table");
        System.out.println("--------cglib----------------");
        String deleteResult = proxy.delete("DELETE FROM table WHERE id = 1");
        System.out.println("--------cglib----------------");

        // 输出方法的返回结果
        System.out.println("Query Result: " + queryResult);
        System.out.println("--------cglib----------------");
        System.out.println("Delete Result: " + deleteResult);
    }
}