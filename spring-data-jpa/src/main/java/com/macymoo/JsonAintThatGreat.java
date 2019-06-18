package com.macymoo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JsonAintThatGreat {

    ObjectMapper mapper = new ObjectMapper();

    public Map parseJson(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // convert JSON string to Map
        Map map = mapper.readValue(json, Map.class);

        return map;
    }
}
