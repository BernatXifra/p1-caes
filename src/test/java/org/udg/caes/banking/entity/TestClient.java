package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {

    @Test
    void testGetId() {
        Client tc = new Client("test");
        assertEquals("test", tc.getId());
    }
}
