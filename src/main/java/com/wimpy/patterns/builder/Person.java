package com.wimpy.patterns.builder;

public class Person {

    private final String name;
    private final String nickname;
    private final String age;
    // There could be many more properties here

    private Person(String name, String nickname, String age) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAge() {
        return age;
    }


    static class Builder {


        protected Builder() {
        }

        private String name;
        private String nickname;
        private String age;

        public static Builder getInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, nickname, age);
        }

    }
}
