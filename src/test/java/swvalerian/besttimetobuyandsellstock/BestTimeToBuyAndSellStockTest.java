package swvalerian.besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit_testCase1() {
        int[] prices = {7,1,5,3,6,4};
        int profit = 5;

        int actual = BestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(profit, actual);
    }

    @Test
    void maxProfit_testCase2() {
        int[] prices = {7,6,4,3,1};
        int profit = 0;

        int actual = BestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(profit, actual);
    }

    @Test
    void maxProfit_testCase3() {
        int[] prices = {7,9,10,13,15,9,6,3,20};
        int profit = 17;

        int actual = BestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(profit, actual);
    }

    @Test
    void maxProfit_testCase4() {
        int[] prices = {7};
        int profit = 0;

        int actual = BestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(profit, actual);
    }

    @Test
    void maxProfit_testCase5() {
        int[] prices = {7, 7};
        int profit = 0;

        int actual = BestTimeToBuyAndSellStock.maxProfit(prices);

        assertEquals(profit, actual);
    }
}