package com.macymoo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YamlSucksAssTest {

    YamlSucksAss yamlSucksAss = new YamlSucksAss();


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("YamlSucksAssTest.tearDown");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("YamlSucksAssTest.test1");
        System.out.println("YamlSucksAssTest.setUp");
        String json = yamlSucksAss.returnJSON("src/test/resources/nginx");
        System.out.println("json = " + json);
    }

    @Test
    public void test2() throws Exception {
        System.out.println("YamlSucksAssTest.test12");
    }

}