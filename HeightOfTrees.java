//You are given n trees and their heights. Your task is to write a program that calculates the maximum number of trees whose height is in increasing order.
//They need not be in continuous manner.
//For instance, if heights of 9 trees are 10, 22, 9, 33, 21, 50, 41, 60, 80. The maximum number of trees whose height is in increasing order is 6 : (10, 22, 33, 50, 60, 80).
//(9,21, 41, 60, 80) is also in increasing manner but you need to find the maximum number of trees whose height is increasing. So, the answer is 6.

//This problem is similar to the longest incresing subsequence problem.
// Dynamic Programming Java implementationof LIS problem

import java.util.*;
class Main{
    public static void main(String[] args){
        int n = 9;
        int[] arr = {10, 22, 9, 33, 21, 50, 41,60, 80};
        int[] dp = new int[n];
      // Initialize LIS values for all index.
        for(int i=0; i<n; i++){
            dp[i] = 1;
        }
       //Compute optimized LIS values in bottom up manner
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
      //find out the maximum of all longest incresing substring value
        int max=0;
        for(int i=0; i<n; i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }
        System.out.println(max);
    }
}
