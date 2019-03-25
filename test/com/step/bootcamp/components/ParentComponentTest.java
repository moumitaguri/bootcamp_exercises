package com.step.bootcamp.components;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParentComponentTest {

    @Test
    void shouldRefreshAParentComponentThatHasOneChild() {

        ParentComponent content = new ParentComponent(ParentComponent.Type.CONTENT);
        content.addChild(new LeafComponent(LeafComponent.Type.TEXT));
        String actual = content.refresh();
        String expected = "CONTENT is refreshed";
        expected += "TEXT is refreshed";
        assertEquals(expected, actual);
    }

    @Test
    void shouldRefreshAParentComponentThatHasMultipleChildren() {

        ParentComponent body = new ParentComponent(ParentComponent.Type.BODY);
        ParentComponent content = new ParentComponent(ParentComponent.Type.CONTENT);
        content.addChild(new LeafComponent(LeafComponent.Type.TEXT));
        content.addChild(new LeafComponent(LeafComponent.Type.IMAGE));
        body.addChild(content);
        body.addChild(new LeafComponent(LeafComponent.Type.BOTTOM_PANEL));
        body.addChild(new LeafComponent(LeafComponent.Type.SIDE_PANEL));

        String expected = "BODY is refreshed";
        expected += "CONTENT is refreshed";
        expected += "TEXT is refreshed";
        expected += "IMAGE is refreshed";
        expected += "BOTTOM_PANEL is refreshed";
        expected += "SIDE_PANEL is refreshed";
        assertEquals(expected, body.refresh());

    }
}