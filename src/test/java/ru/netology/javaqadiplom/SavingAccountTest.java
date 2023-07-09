package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {
    @Test
    public void payLessThanMinBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(true, account.pay(500));
        System.out.println(account.getBalance());
    }

    @Test
    public void payMoreThanMinBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(false, account.pay(3_000));
        System.out.println(account.getBalance());
    }

    @Test
    public void payEqualsThanMinBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(true, account.pay(1_000));
        System.out.println(account.getBalance());
    }

    @Test
    public void payNegativeAmount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(false, account.pay(-1_000));
        System.out.println(account.getBalance());
    }

    @Test
    public void addLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(true, account.add(3_000));
        System.out.println(account.getBalance());
    }

    @Test
    public void addMoreThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(false, account.add(9_000));
        System.out.println(account.getBalance());
    }

    @Test
    public void addEqualsThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(true, account.add(8_000));
        System.out.println(account.getBalance());
    }

    @Test
    public void addNegativeAmount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(false, account.add(-1_000));
        System.out.println(account.getBalance());
    }

    @Test
    public void yearChange() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        Assertions.assertEquals(100, account.yearChange());
        System.out.println(account.yearChange());
    }

    @Test
    public void IllegalArgumentExceptionRate() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                -10
        );
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.yearChange();
        });
        System.out.println(account.yearChange());
    }
}