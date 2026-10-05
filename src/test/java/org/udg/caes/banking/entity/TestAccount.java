package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;
import org.udg.caes.banking.exceptions.NotEnoughBalance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAccount {

    @Test
    void testCredit() {
        Account ac = new Account("test", 10);
        ac.credit(10);
        assertEquals(20, ac.getBalance());
    }

    @Test
    void testGetId() {
        Account ac = new Account("test", 10);
        assertEquals("test", ac.getId());
    }

    @Test
    void testDebit() throws NotEnoughBalance {
        Account ac = new Account("test", 10);
        ac.debit(5);
        assertEquals(5,ac.balance);

        assertThrows(
                NotEnoughBalance.class,
                () -> {
                    ac.debit(10);
                }
        );
        assertEquals(5, ac.balance);
    }
}
