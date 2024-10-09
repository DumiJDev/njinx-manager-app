package io.github.dumijdev.njinxmanager.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class LocationModel {
    private Long id;
    private String name;
    private String description;
    private String path;
    private Map<String, String> attributes;

    public LocationModel(String name, String path) {
        this.name = name;
        this.path = path;
        attributes = new HashMap<>();
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public void removeAttribute(String key) {
        attributes.remove(key);
    }

    public String getAttribute(String key) {
        return attributes.get(key);
    }

}
