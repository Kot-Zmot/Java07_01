package ru.netology.stats;

public class StatsService {

    //1.Сумма всех продаж
    public long getSummSales(long[] arr) {
        long summSales = 0;
        for (int i = 0; i < arr.length; i++) {
            summSales = summSales + arr[i];
        }
        return summSales;
    }

    //2.Средняя сумма продаж в месяц
    public long getAverageSumm(long[] arr) {
        return getSummSales(arr) / arr.length;
    }

    //3.Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int getMaxMonthSale(long[] arr) {
        int numberMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[numberMonth]) {
                numberMonth = i;
            }
        }
        return numberMonth + 1;
    }

    //4.Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int getMinMonthSale(long[] arr) {
        int numberMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[numberMonth]) {
                numberMonth = i;
            }
        }
        return numberMonth + 1;
    }

    //5.Кол-во месяцев, в которых продажи были ниже среднего
    public int getLowerThanAverageSumm(long[] arr) {
        long averageSumm = getAverageSumm(arr);
        int numberMonths = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < averageSumm) {
                numberMonths++;
            }
        }
        return numberMonths;
    }

    //6.Кол-во месяцев, в которых продажи были выше среднего
    public int getHigherThanAverageSumm(long[] arr) {
        long averageSumm = getAverageSumm(arr);
        int numberMonths = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > averageSumm) {
                numberMonths++;
            }
        }
        return numberMonths;
    }
}