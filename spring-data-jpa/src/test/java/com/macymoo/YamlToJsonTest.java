package com.macymoo;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;


public class YamlToJsonTest {

    YamlToJson yamlToJson = new YamlToJson();


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("YamlToJsonTest.tearDown");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("YamlToJsonTest.test12");
    }

    @Test
    public void test1() throws Exception {
        String returnJSON = yamlToJson.returnJSON("src/test/resources/nginx");
        File file = new File("src/test/resources/nginx.json");
        String validJSON = FileUtils.readFileToString(file);
        assertEquals("Yaml to Json failed.", validJSON, returnJSON);
    }


}