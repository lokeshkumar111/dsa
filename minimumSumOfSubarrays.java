//Given an array of N integers. Find the minimum sum of K consecutive elements
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=0; t<tc; t++){
            int n = sc.nextInt(); // number of elements in array
            int k= sc.nextInt(); // length of subarray
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int minSum=0;
            for (int i=0; i<k; i++){
               minSum+=arr[i];
            }
            int wSum=minSum;
            for (int i=k; i<n; i++){
               wSum+=arr[i]-arr[i-k];
               minSum= Math.min(minSum, wSum);
            }
            System.out.println(minSum); 
        }
    }
}
