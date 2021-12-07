package com.wimpy.patterns.builder;

import org.junit.jupiter.api.Test;

class PersonBuilderPatternTest {


    @Test
    void testBuilderPattern() {

        Person.Builder builder = Person.Builder.getInstance();

        Person build = Person.Builder
                .getInstance()
                .setAge("10")
                .setName("marco")
                .setNickname("Marco polo")
                .build();

    }

    @Test
    void testBuilderPattern() {

        Person.Builder builder = Person.Builder.getInstance();

        PersonFluid build = PersonFluid.Builder();

                .getInstance()
                .setAge("10")
                .setName("marco")
                .setNickname("Marco polo")
                .build();

    }
}