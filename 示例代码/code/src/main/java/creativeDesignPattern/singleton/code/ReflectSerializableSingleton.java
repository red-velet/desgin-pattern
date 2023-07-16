package creativeDesignPattern.singleton.code;

import java.io.Serializable;

/**
 * Author: shawn
 * createTime: 2023/7/5
 * Description: 单例设计模式-反射和序列化问题
 */
public class ReflectSerializableSingleton implements Serializable {
    private static volatile ReflectSerializableSingleton INSTANCE;

    private ReflectSerializableSingleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("实例：【" + this.getClass().getName() + "】已经存在，该实例只允许实例化一次");
        }
    }

    public static ReflectSerializableSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ReflectSerializableSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ReflectSerializableSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
