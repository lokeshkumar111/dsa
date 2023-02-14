// The Fibonacci numbers are the numbers in the following integer sequence. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

// Fibonacci Series dp Solution

import java.util.*;
class fibonacci {
    public static void main(String[] args)
    {
        long n = 5;
        System.out.println(fib(n));
    }
    static HashMap<Long, Long> mp = new HashMap<>();
  
    public static long fib(long n)
    {
      // 0th and 1st number of the series are 0 and 1
        if(n==0 || n==1)
            return n;
      
        if(mp.containsKey(n))
            return mp.get(n);
      
        long temp1 = fib(n-1);
        long temp2 = fib(n-2);
      
      // Add the previous 2 numbers in the series and store it
        long ans = temp1 + temp2;
      
      //store value in the map
        mp.put(n, ans);
      
        return ans;
    }
}
