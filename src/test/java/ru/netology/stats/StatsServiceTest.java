package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //1.Тест общей суммы
    @Test
    public void shouldTestSummSales() {
        StatsService service = new StatsService();
        long[] arr = {2, 2, 2, 2, 2};
        long expectedSumm = 10;
        long actualSumm = service.getSummSales(arr);
        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    //2.Тест средней суммы в месяц
    @Test
    public void shouldTestAverageSales() {
        StatsService service = new StatsService();
        long[] arr = {2, 2, 2, 2, 2};
        long expectedAverageSumm = 2;
        long actualAverageSumm = service.getAverageSumm(arr);
        Assertions.assertEquals(expectedAverageSumm, actualAverageSumm);
    }

    //3.Тест номера месяца с пиком продаж
    @Test
    public void shouldTestMaxMonthSale() {
        StatsService service = new StatsService();
        long[] arr = {1, 2, 3, 3, 1};
        long expectedMax = 4;
        long actualMax = service.getMaxMonthSale(arr);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    //4.Тест номера месяца с минимумом продаж
    @Test
    public void shouldTestMinMonthSale() {
        StatsService service = new StatsService();
        long[] arr = {1, 2, 3, 3, 1};
        long expectedMin = 5;
        long actualMin = service.getMinMonthSale(arr);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    //5.Тест кол-ва месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldTestLowerAverageSale() {
        StatsService service = new StatsService();
        long[] arr = {1, 2, 3, 3, 1};
        long expectedMin = 2;
        long actualMin = service.getLowerThanAverageSumm(arr);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    //6.Тест кол-ва месяцев, в которых продажи были выше среднего
    @Test
    public void shouldTestHigherAverageSale() {
        StatsService service = new StatsService();
        long[] arr = {1, 2, 3, 3, 1};
        long expectedMax = 2;
        long actualMax = service.getHigherThanAverageSumm(arr);
        Assertions.assertEquals(expectedMax, actualMax);
    }
}
