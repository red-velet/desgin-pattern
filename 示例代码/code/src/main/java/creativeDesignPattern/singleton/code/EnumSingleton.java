package creativeDesignPattern.singleton.code;

/**
 * Author: shawn
 * createTime: 2023/7/5
 * Description: No Description
 */
public class EnumSingleton {
    private EnumSingleton() {
        // 私有构造函数
    }

    public static EnumSingleton getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

    private static enum SingletonEnum {
        INSTANCE;

        private EnumSingleton instant;

        // 在枚举常量中初始化单例实例
        private SingletonEnum() {
            instant = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return instant;
        }
    }
}
