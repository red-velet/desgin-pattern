package structuralDesignPattern.proxy.staticProxy;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: 定义一个共同的接口，代表数据库操作
 */
public interface DataBase {
    String queryData(String query);
}
