package challenges.minimalNumberOfCoins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimalNumberOfCoinsTest {
    MinimalNumberOfCoins m;

    @Before
    public void setUp() throws Exception {
        m = new MinimalNumberOfCoins();
    }

    @Test
    public void minimalNumberOfCointsTest() {
        int[] arr1 = {1,2,10};
        int[] arr2 = {1, 5, 10, 100};
        int[] arr3 = {1};
        int[] arr4 = {1,2,20,60,120};
        int[] arr5 = {1,3,6,30};
        // 5 public test case
        assertEquals(6, m.minCoins(arr1, 28));
        assertEquals(10, m.minCoins(arr2, 239));
        assertEquals(8, m.minCoins(arr3, 8));
        assertEquals(7, m.minCoins(arr4, 150));
        assertEquals(4, m.minCoins(arr5, 45));
    }
}