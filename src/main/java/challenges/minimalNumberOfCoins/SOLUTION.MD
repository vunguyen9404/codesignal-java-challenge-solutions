# MY Solution
Example  
```aidl
int[] coins = {1, 2, 10};  
int price = 28;
```

- Loop 1  
coins[2] = 10;  
=> sum of coin = 0 + (28 / 10) = 2  
next, set price = 28 % 10 = 8
- Loop 2  
coins[1] = 2;
=> sum of coin = 2 + (8 / 2) = 6  
next set price = 8 % 2 = 0  
- Loop 3
price = 0 => break loop

**result = 6 coins;** 