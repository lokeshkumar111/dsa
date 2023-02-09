// Given an array of non-negative integers, and a value 'sum', determine if there is a subset of the given set (array) with sum equal to given sum.
// If there is a subset whose sum is equal to the required sum then print "yes" else print "no" without quotes.

import java.util.*;
class Main {
  public static boolean isSubsetSum(int arr[], int n, int sum){
    //if value of sum become zero it means sum is found in the array 
      if (sum == 0)
        return true;
   //if value of sum become zero it means sum is found in the array 
      if (n == 0)
        return false;
      
      if (arr[n - 1] > sum){
        return isSubsetSum(arr, n - 1, sum);
      
      return isSubsetSum(arr, n - 1, sum) || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
  }
    
  //driver code
  public static void main(String args[]){
    
      int arr[] = {1, 2, 3, 4, 5 ,6 ,7, 8, 9};
      int sum = 5;
      int n = arr.length;

      if (isSubsetSum(arr, n, sum))
        System.out.println("yes");

      else
        System.out.println("no");
  }
}
