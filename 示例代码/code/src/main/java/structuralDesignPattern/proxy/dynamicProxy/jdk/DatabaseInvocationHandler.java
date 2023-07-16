package structuralDesignPattern.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: 该代理处理器类负责处理代理对象的方法调用，并在方法调用前后执行额外的逻辑操作。
 */
public class DatabaseInvocationHandler implements InvocationHandler {

    private DataBase dataBase;

    public DatabaseInvocationHandler() {
        this.dataBase = new DataBaseImpl();
    }

    public DatabaseInvocationHandler(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * invoke()方法用于处理代理对象的方法调用。
     *
     * @param proxy  代理对象本身
     * @param method 被调用的方法对象
     * @param args   方法的参数数组
     * @return 方法的返回结果
     * @throws Throwable 异常信息
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在方法调用前的逻辑处理
        // 如:判断方法名,查看是否需要做记录日志
        String methodName = method.getName();
        if ("delete".equals(methodName)) {
            //是删除操作才做增强,不然还是调用原方法
            System.out.println("Recording deletion operation log");
        }
        System.out.println("Before method: " + methodName);
        System.out.println("Arguments: " + args[0]);


        // 调用被代理对象的方法
        Object result = method.invoke(dataBase, args);

        // 在方法调用后的逻辑处理
        // ...
        System.out.println("Result: " + result);
        System.out.println("After method: " + method);
        // 返回方法的返回结果
        return result;
    }

}
