package com.macymoo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class YamlSucksAss {

    private static String readYamlFile(String ymlFilePath) throws IOException {
        String lineSeparator = System.getProperty("line.separator");
        List<String> lines = Files.readAllLines(Paths.get(ymlFilePath));

        return lines.stream().collect(Collectors.joining(lineSeparator));
    }

    private static String convertYamlToJson(String yaml) throws IOException {

        ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
        Object obj = yamlReader.readValue(yaml, Object.class);

        ObjectMapper jsonWriter = new ObjectMapper();
        return jsonWriter.writeValueAsString(obj);
    }

    public String returnJSON(String ymlFilePath) throws IOException {

        String yaml = readYamlFile(ymlFilePath);

        String jsonFilePath = FilenameUtils.removeExtension(ymlFilePath)
                + ".json";

        String jsonStr = null;
        try {
            jsonStr = convertYamlToJson(yaml.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }
}
