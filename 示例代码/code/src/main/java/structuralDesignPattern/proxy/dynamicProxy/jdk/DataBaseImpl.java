package structuralDesignPattern.proxy.dynamicProxy.jdk;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class DataBaseImpl implements DataBase {
    @Override
    public String query(String query) {
        // 模拟执行数据库查询
        System.out.println("Executing database query: " + query);

        // 返回查询结果
        return "Result for query: " + query;
    }

    @Override
    public String delete(String delete) {
        // 模拟执行数据库删除
        System.out.println("Executing database delete: " + delete);

        // 返回删除结果
        return "Result for delete: " + delete;
    }
}
