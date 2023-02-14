/*
Robbery is pretty common in dp nation. A robber is planning to rob houses along a street. Each house has a certain amount of gold stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have a very smart security system connected
and it will automatically alert the police if two adjacent houses were robbed on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money the roober can rob
tonight without getting caught.
*/

class RobbingHouse
{
    public static void main(String[] args)
    {
            int n = 3;
            int[] arr = { 2, 100, 99 };
      
      //Declare the ans array
            int[] ans = new int[n];
      
      //initializes the value in ans Array
            ans[0] = arr[0];
            ans[1] = Math.max(arr[0], arr[1]);
      
      //loop to find the maximum possible sum
            for(int i=2; i<n; i++)
            {
                ans[i] = Math.max((ans[i-2] + arr[i]), ans[i-1]);
            }
      
      //print the maximum sum
            System.out.println(ans[n-1]);
        }
    }
}
