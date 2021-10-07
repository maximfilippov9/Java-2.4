package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }


    public long average(long[] sales) {
        long sum = sum(sales);
        return sum / sales.length;
    }

    public int monthWithMax(long[] sales) {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        int monthCounter = 0;
        int monthWithMax = 0;
        for (long sale : sales) {
            monthCounter++;
            if (sale == max) {
                monthWithMax = monthCounter;
            }

        }

        return monthWithMax;
    }

    public long monthWithMin(long[] sales) {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        int monthCounter = 0;
        int monthWithMin = 0;
        for (long sale : sales) {
            monthCounter++;
            if (sale == min) {
                monthWithMin = monthCounter;
            }
        }

        return monthWithMin;

    }

    public long monthCountMoreThanAverage(long[] sales) {
        long average = average(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale > average) {
                monthCount++;
            }
        }

        return monthCount;
    }

    public long monthCountLessThanAverage(long[] sales) {
        long average = average(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale < average) {
                monthCount++;
            }
        }

        return monthCount;
    }
}


