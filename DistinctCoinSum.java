// You have n coins with certain values. Your task is to find all distinct money sums you can create using these coins.

class CoinSum
{
  // sum denotes the current sum of the subset currindex denotes
  // the index we have reached in the given array
  public static void distSumRec(int arr[], int n, int sum, int currindex, HashSet<Integer> s)
  {
    
    if(currindex > n)
      return;

    if(currindex == n)
    {
      s.add(sum);
      return;
    }
    distSumRec(arr, n, sum + arr[currindex], currindex + 1, s);
    distSumRec(arr, n, sum, currindex + 1, s);
 }
  
  // This function mainly calls recursive function distSumRec()
  // to counts number of distinct sum subsets. And finally prints number of distinct coin sum possible.
  public static void printDistSum(int arr[], int n)
  {
      HashSet<Integer> s = new HashSet<>();
    
      distSumRec(arr, n, 0, 0, s);
      int count = 0;
    
      //count the number of distinct coin sum
      for ( int i : s )
      {
        if( i > 0 )
        count++;
      }
    // print the number of distinct coin sum
      System.out.println(count);
	}	
  //Driver code
  public static void main(String[] args)
  {
     int n = 3;
     int[] arr = { 3, 5, 2 };

      //function call
     printDistSum(arr, n);
 }
}

