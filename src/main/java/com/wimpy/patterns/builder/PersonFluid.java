package com.wimpy.patterns.builder;

interface FluidBuilder {
    PersonFluid.Builder getInstance();

    PersonFluid build();
}

interface Name {
    Nickname name(String name);
}

interface Nickname {
    Age nickname(String nickname);
}

interface Age {
    FluidBuilder age(String age);
}


public class PersonFluid {

    private final String name;
    private final String nickname;
    private final String age;
    // There could be many more properties here

    private PersonFluid(String name, String nickname, String age) {
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


    static class Builder implements FluidBuilder, Age, Nickname, Name {

        private Builder() {
        }

        private String name;
        private String nickname;
        private String age;

        @Override
        public Nickname name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Age nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        @Override
        public FluidBuilder age(String age) {
            this.age = age;
            return this;
        }

        @Override
        public PersonFluid.Builder getInstance() {
            return new PersonFluid.Builder();
        }

        @Override
        public PersonFluid build() {
            return new PersonFluid(name, nickname, age);
        }
    }
}
