package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCreditCard {

    @Test
    void testCredit() {
        CreditCard cc = new CreditCard("test");     // Arrange
        cc.credit(100);                         // Act
        assertEquals(100, cc.getCredit());     // Assert
    }

    @Test
    void testReset() {
        CreditCard cc = new CreditCard("test");
        cc.credit(100);
        cc.reset();
        assertEquals(0,cc.getCredit());
    }

    @Test
    void testMaxCredit() {
        CreditCard cc = new CreditCard("test");
        cc.maxCredit = 100;
        assertEquals(100,cc.getMaxCredit());
    }

    @Test
    void testGetId() {
        CreditCard cc = new CreditCard("test");
        assertEquals("test", cc.getId());
    }

}
