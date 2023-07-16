package creativeDesignPattern.builder;

/**
 * Author: shawn
 * createTime: 2023/7/13
 * Description: No Description
 */
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final String address;

    private ImmutablePerson(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public ImmutablePerson build() {
            return new ImmutablePerson(this);
        }
    }

    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson.Builder()
                .setName("John")
                .setAge(30)
                .setAddress("123 Street")
                .build();

    }
}
