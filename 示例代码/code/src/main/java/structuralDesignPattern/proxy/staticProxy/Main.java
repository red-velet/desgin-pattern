package structuralDesignPattern.proxy.staticProxy;

/**
 * Author: shawn
 * createTime: 2023/7/16
 * Description: No Description
 */
public class Main {
    public static void main(String[] args) {
        DataBase database = new DatabaseProxy();

        // 第一次执行查询，将结果存入缓存
        String result1 = database.queryData("SELECT * FROM table1");
        System.out.println("Result 1: " + result1);

        // 第二次执行相同的查询，从缓存中获取结果
        String result2 = database.queryData("SELECT * FROM table1");
        System.out.println("Result 2: " + result2);
    }
}