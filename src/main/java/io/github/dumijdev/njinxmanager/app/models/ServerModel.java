package io.github.dumijdev.njinxmanager.app.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ServerModel {
    private Long id;
    private String name;
    private String host;
    private String description;
    private int port;
    private List<LocationModel> locations;
    private Map<String, String> properties;

    public ServerModel(String name, String host, int port) {
        this.name = name;
        this.host = host;
        this.port = port;
        locations = new ArrayList<>();
        properties = new HashMap<>();
    }

    public void addLocation(LocationModel location) {
        locations.add(location);
    }

    public void removeLocation(LocationModel location) {
        locations.remove(location);
    }

    public void addProperty(String key, String value) {
        properties.put(key, value);
    }

    public void removeProperty(String key) {
        properties.remove(key);
    }

    public String getProperty(String key) {
        return properties.get(key);
    }

}
