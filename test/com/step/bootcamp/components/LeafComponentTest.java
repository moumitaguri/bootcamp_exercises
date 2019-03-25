package com.step.bootcamp.components;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeafComponentTest {

    @Test
    void shouldRefreshALeafComponent() {
        Refreshable image = new LeafComponent(LeafComponent.Type.IMAGE);

        String expected = "IMAGE is refreshed";
        assertEquals(expected, image.refresh());
    }
}
