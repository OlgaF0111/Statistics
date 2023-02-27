package ru.netology.stats;

import java.util.Arrays;

import ru.netology.stats.StatsService;

public class StatsService {

    public long totalSales(long[] sales) {
        long sum = 0;
        for (long num : sales) {
            sum += num;
        }
        return sum;
    }


    public long averageSale(long[] sales) {
        long total = totalSales(sales);
        long average = total / sales.length;

        return average;
    }


    public int peakSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int counter = 0;

        for (long sale : sales) {
            if (sale < averageSale(sales)) {

                counter++;
            }
        }
        return counter;
    }


    public int salesAreAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }
}

















