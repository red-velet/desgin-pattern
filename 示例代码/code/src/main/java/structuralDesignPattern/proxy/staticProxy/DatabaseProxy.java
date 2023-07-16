package structuralDesignPattern.proxy.staticProxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class DatabaseProxy implements DataBase {

    private DataBase database;
    private Map<String, String> cache; // 查询缓存

    public DatabaseProxy() {
        this.database = new DataBaseImpl();
        this.cache = new HashMap<>();
    }

    @Override
    public String queryData(String query) {
        // 先检查缓存中是否存在查询结果
        if (cache.containsKey(query)) {
            System.out.println("Retrieving cached result for query: " + query);
            return cache.get(query);
        }

        // 如果缓存中不存在查询结果，则执行实际的数据库查询
        String result = database.queryData(query);

        // 将查询结果存入缓存
        cache.put(query, result);

        return result;
    }

}
