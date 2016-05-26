package com.snovelli.seo.ktt.model;

public enum DeviceType {
    DESKTOP("DESKTOP"), MOBILE("MOBILE");

    private final String name;

    DeviceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
