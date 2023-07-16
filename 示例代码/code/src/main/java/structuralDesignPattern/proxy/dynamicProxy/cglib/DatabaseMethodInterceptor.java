package structuralDesignPattern.proxy.dynamicProxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: 该代理处理器类负责处理代理对象的方法调用，并在方法调用前后执行额外的逻辑操作。
 */
public class DatabaseMethodInterceptor implements MethodInterceptor {

    private DataBaseImpl dataBase;

    public DatabaseMethodInterceptor() {
        this.dataBase = new DataBaseImpl();
    }

    public DatabaseMethodInterceptor(DataBaseImpl dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 在方法调用前的逻辑处理
        // 如:判断方法名,查看是否需要做记录日志
        String methodName = method.getName();
        if ("delete".equals(methodName)) {
            //是删除操作才做增强,不然还是调用原方法
            System.out.println("Recording deletion operation log");
        }
        System.out.println("Before method: " + methodName);
        System.out.println("Arguments: " + objects[0]);


        // 调用被代理对象的方法
        Object result = method.invoke(dataBase, objects);

        // 在方法调用后的逻辑处理
        // ...
        System.out.println("Result: " + result);
        System.out.println("After method: " + method);
        // 返回方法的返回结果
        return result;
    }
}
