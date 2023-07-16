package creativeDesignPattern.singleton.code;

/**
 * Author: shawn
 * createTime: 2023/7/5
 * Description: 单例设计模式-静态内部类
 */
public class InnerSingleton {

    private InnerSingleton() {

    }

    public static InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }
}
