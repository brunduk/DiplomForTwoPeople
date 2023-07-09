package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {

    @Test
    public void shouldAddToPositiveBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);

        Assertions.assertEquals(3_000, account.getBalance());
        System.out.println(account.getBalance());
    }

    @Test
    public void negativeScenario() {
        CreditAccount account = new CreditAccount(
                1_000,
                5_000,
                -15
        );

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> account.add(3000)
        );
    }

    @Test
    public void payShouldBalance() {
        CreditAccount account = new CreditAccount(
                5_000,
                5_000,
                10
        );

        account.pay(2_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void payMoreCreditLimit() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        Assertions.assertEquals(false, account.pay(10_000));
    }

    @Test
    public void payOnCreditLimit() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        Assertions.assertEquals(true, account.pay(1_000));
    }

    @Test
    public void payNegativeAmount() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        Assertions.assertEquals(false, account.pay(-1_000));
    }

    @Test
    public void addSumOnCard() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        Assertions.assertEquals(true, account.add(1_000));
    }

    @Test
    public void addNegativeSumOnCard() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        Assertions.assertEquals(false, account.add(-1_000));
    }

    @Test
    public void addSumOnZeroBalanceShould() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(1_000);

        Assertions.assertEquals(1_000, account.getBalance());
    }

    @Test
    public void addSumOnBalanceShould() {
        CreditAccount account = new CreditAccount(
                1_000,
                5_000,
                15
        );

        account.add(1_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }

    @Test
    public void yearPercentNegativeBalance() {
        CreditAccount account = new CreditAccount(
                -1000,
                5_000,
                10
        );

        Assertions.assertEquals(-100, account.yearChange());
    }

    @Test
    public void yearPercentPositiveBalance() {
        CreditAccount account = new CreditAccount(
                1000,
                5_000,
                10
        );

        Assertions.assertEquals(0, account.yearChange());
    }
}
