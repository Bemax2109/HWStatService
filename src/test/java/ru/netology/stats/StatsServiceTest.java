package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSumSales() {

        assertEquals(180, service.sum(sales));
    }

    @Test
    void shouldMean() {

        assertEquals(15, service.mean(sales));
    }

    @Test
    void shouldMonthSalesWithMax() {

        assertEquals(8, service.monthWithMaximum(sales));

    }

    @Test
    void shouldMonthSalesWithMin() {

        assertEquals(9, service.monthWithMinimum(sales));

    }

    @Test
    void shouldSalesAboveAverage() {

        assertEquals(5, service.salesAboveAverage(sales));

    }

    @Test
    void shouldSalesBelowAverage() {

        assertEquals(5, service.salesBelowAverage(sales));

    }
}