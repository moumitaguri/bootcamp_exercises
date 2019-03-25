package com.step.bootcamp.components;

import java.util.ArrayList;
import java.util.List;

public class ParentComponent implements Refreshable {

    private Type type;
    private List<Refreshable> childrenComponents;

    ParentComponent(Type type) {
        this.type = type;
        this.childrenComponents = new ArrayList<>();
    }

    void addChild(Refreshable child) {
        this.childrenComponents.add(child);
    }

    void removeChild(Refreshable child) {
        this.childrenComponents.remove(child);
    }

    @Override
    public String refresh() {
        StringBuilder result = new StringBuilder(this.type.name() + " is refreshed");
        for (Refreshable childComponent : childrenComponents) {
            result.append(childComponent.refresh());
        }
        return result.toString();
    }

    enum Type {
        CONTENT,
        BODY
    }
}
