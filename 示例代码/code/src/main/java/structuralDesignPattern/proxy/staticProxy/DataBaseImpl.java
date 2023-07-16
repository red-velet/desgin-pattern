package structuralDesignPattern.proxy.staticProxy;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class DataBaseImpl implements DataBase {
    @Override
    public String queryData(String query) {
        // 模拟执行数据库查询
        System.out.println("Executing database query: " + query);

        // 返回查询结果
        return "Result for query: " + query;
    }
}
