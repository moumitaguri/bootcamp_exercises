package com.step.bootcamp.components;

public class LeafComponent implements Refreshable {

    private Type type;

    LeafComponent(Type type) {
        this.type = type;
    }

    @Override
    public String refresh() {
        return this.type.name() + " is refreshed";
    }

    enum Type {
        SIDE_PANEL,
        TEXT,
        IMAGE,
        BOTTOM_PANEL

    }
}
