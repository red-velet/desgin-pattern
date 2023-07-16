package creativeDesignPattern.singleton.code;

/**
 * Author: shawn
 * createTime: 2023/7/5
 * Description: 单例设计模式-懒汉式
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
