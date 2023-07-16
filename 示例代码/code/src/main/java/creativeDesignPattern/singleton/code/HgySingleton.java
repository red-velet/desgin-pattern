package creativeDesignPattern.singleton.code;

/**
 * Author: shawn
 * createTime: 2023/7/5
 * Description: 单例设计模式-饿汉式
 */
public class HgySingleton {
    private static final HgySingleton INSTANCE = new HgySingleton();

    private HgySingleton() {
    }

    public static HgySingleton getInstance() {
        return INSTANCE;
    }
}
