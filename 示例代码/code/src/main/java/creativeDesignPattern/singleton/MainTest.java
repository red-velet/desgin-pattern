package creativeDesignPattern.singleton;

import creativeDesignPattern.singleton.code.HgySingleton;
import creativeDesignPattern.singleton.code.LazySingleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * Author: shawn
 * createTime: 2023/7/5
 * Description: No Description
 */
@Slf4j
public class MainTest {
    @Test
    public void testHgySingleton() {
        log.debug("是同一个实例吗? --> {}", HgySingleton.getInstance() == HgySingleton.getInstance() ? "是" : "不是");
        log.debug("是同一个实例吗? --> {}", HgySingleton.getInstance() == HgySingleton.getInstance());
    }

    @Test
    public void testLazySingleton() {
        log.debug("是同一个实例吗? --> {}", LazySingleton.getInstance() == LazySingleton.getInstance() ? "是" : "不是");
        log.debug("是同一个实例吗? --> {}", LazySingleton.getInstance() == LazySingleton.getInstance());
        log.info("-----------------------------------------------------------------");
        //不好测试
        Thread thread1 = new Thread(() -> {
            log.debug("thead1 = {}", LazySingleton.getInstance());
        });
        Thread thread2 = new Thread(() -> {
            log.debug("thead2 = {}", LazySingleton.getInstance());
        });
        thread1.start();
        thread2.start();
    }
}
