package creativeDesignPattern.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Author: shawn
 * createTime: 2023/7/13
 * Description: No Description
 */
@Builder
@Getter
@ToString
public class User {
    private String name;
    private Integer age;
    private String bobby;

    public static void main(String[] args) {
        User.UserBuilder builder = new UserBuilder();
        User user = builder.name("jack").age(18).bobby("rap").build();
        System.out.println("user = " + user);
    }
}
