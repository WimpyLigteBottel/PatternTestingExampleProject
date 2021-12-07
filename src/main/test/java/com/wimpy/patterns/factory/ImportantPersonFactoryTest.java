package com.wimpy.patterns.factory;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ImportantPersonFactoryTest {

    @Test
    void build() {

        List<String> build = ImportantPersonFactory.build();


        // without changing the code for ImportantPersonFactory i can just change the internals


        assertTrue(build.size() > 0);

    }
}