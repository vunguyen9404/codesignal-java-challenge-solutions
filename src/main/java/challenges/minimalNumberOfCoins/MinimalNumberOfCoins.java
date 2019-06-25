package challenges.minimalNumberOfCoins;

public class MinimalNumberOfCoins {
    public int minCoins(int[] coins, int price) {
        int res = 0;
        for (int i = coins.length - 1; i >= 0 ; i--) {
            if (price >= coins[i]) {
                res += price/coins[i];
                price = price % coins[i];
            }
        }

        return res;
    }
}
