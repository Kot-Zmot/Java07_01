package ru.netology.stats;

public class StatsService {

    //1.Сумма всех продаж
    public int getSummSales(int[] arr) {
        int summSales = 0;
        for (int i = 0; i < arr.length; i++) {
            summSales = summSales + arr[i];
        }
        return summSales;
    }

    //2.Средняя сумма продаж в месяц
    public int getAverageSumm(int[] arr) {
        int summSales = 0;
        for (int i = 0; i < arr.length; i++) {
            summSales = summSales + arr[i];
        }
        int averageSumm = summSales / arr.length;
        return averageSumm;
    }

    //3.Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int getMaxMonthSale(int[] arr) {
        int numberMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[numberMonth]) {
                numberMonth = i;
            }
        }
        return numberMonth + 1;
    }

    //4.Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int getMinMonthSale(int[] arr) {
        int numberMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[numberMonth]) {
                numberMonth = i;
            }
        }
        return numberMonth + 1;
    }

    //5.Кол-во месяцев, в которых продажи были ниже среднего
    public int getLowerThanAverageSumm(int[] arr) {
        int summSales = 0;
        for (int i = 0; i < arr.length; i++) {
            summSales = summSales + arr[i];
        }
        int averageSumm = summSales / arr.length;
        int numberMonths = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < averageSumm) {
                numberMonths++;
            }
        }
        return numberMonths;
    }

    //6.Кол-во месяцев, в которых продажи были вышу среднего
    public int getHigherThanAverageSumm(int[] arr) {
        int summSales = 0;
        for (int i = 0; i < arr.length; i++) {
            summSales = summSales + arr[i];
        }
        int averageSumm = summSales / arr.length;
        int numberMonths = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > averageSumm) {
                numberMonths++;
            }
        }
        return numberMonths;
    }
}