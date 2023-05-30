package ru.netology.service;

public class CashBackHackerTest {
    @org.junit.Test
    public void testAmount0() {
        //подготовка
        CashBackHacker service = new CashBackHacker();
        int amount = 0;
        // выполнение целевого действия
        int expected = 1000;
        int actual = service.remain(amount);
        // сравнение ожидаемог ои фактического
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount1() {

        CashBackHacker service = new CashBackHacker();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount999() {

        CashBackHacker service = new CashBackHacker();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount1000() {

        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount1001() {

        CashBackHacker service = new CashBackHacker();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testAmount555() {

        CashBackHacker service = new CashBackHacker();
        int amount = 555;

        int expected = 445;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAmount1977() {

        CashBackHacker service = new CashBackHacker();
        int amount = 1977;

        int expected = 23;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }
}