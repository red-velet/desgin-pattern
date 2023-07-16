package creativeDesignPattern.singleton.code;

/**
 * Author: shawn
 * createTime: 2023/7/5
 * Description: 单例设计模式-双重检查锁
 */
public class DclSingleton {
    private static volatile DclSingleton INSTANCE;

    private DclSingleton() {

    }

    public static DclSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DclSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DclSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
