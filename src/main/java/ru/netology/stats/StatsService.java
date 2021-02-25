package ru.netology.stats;

import static java.lang.System.*;

public class StatsService {
    public int sum(int[] sales) {
        int salessum = 0;
        for (int sale : sales) {
            salessum += sale;
        }
        return salessum;
    }

    public int mean(int[] sales) {
        int sum = sum(sales);
        int mean = sum / sales.length;
        return mean;
    }

    public int monthWithMaximum(int[] items) {

        int max = items[0];
        for (int item : items) {
            if (max < item) {
                max = item;
            }
        }
        int monthMax = 0;
        int monthCounter = 0;
        for (int item : items) {
            monthCounter++;
            if (item == max) {
                monthMax = monthCounter;
            }
        }
        return monthMax;
    }

    public int monthWithMinimum(int[] items) {

        int min = items[0];
        for (int item : items) {
            if (min > item) {
                min = item;
            }
        }
        int monthMin = 0;
        int monthCounter = 0;
        for (int item : items) {
            monthCounter++;
            if (item == min) {
                monthMin = monthCounter;
            }
        }
        return monthMin;
    }

    public int salesAboveAverage(int[] items) {
        int mean = mean(items);
        int monthCounter = 0;
        for (int item : items) {
            if (item > mean) {
                monthCounter++;
            }
        }
        return monthCounter;
    }

    public int salesBelowAverage(int[] items) {
        int mean = mean(items);
        int monthCounter = 0;
        for (int item : items) {
            if (item < mean) {
                monthCounter++;
            }
        }
        return monthCounter;
    }
}



