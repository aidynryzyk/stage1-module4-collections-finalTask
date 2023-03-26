package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String key:
             sourceMap.keySet()) {
            if (map.containsKey(key.length())) {
                map.get(key.length()).add(key);
            } else {
                map.put(key.length(), new HashSet<>());
                map.get(key.length()).add(key);
            }
        }
        return map;
    }
}
