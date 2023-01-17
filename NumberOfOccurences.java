//You are given n different numbers and an integer k. Write a program that finds number of times x is present in log(n) time complexity.
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); // size of array for example n = 6;
        int x= sc.nextInt(); // element for example x = 3;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt(); //elements present in array for example 2 3 3 3 6 9
        }
        int UB = upperBound(arr,n,x); //the upper bound function return 4 for 2 3 3 3 6 9 this array, arr[i]>x
        int LB = lowerBound(arr,n,x); //the lower bound function return 1 for 2 3 3 3 6 9 this array, arr[i]>=x
      
      //when we subtract lower bound from the upper bound we find the occurences of the element 
        System.out.println(UB-LB); // it print 3 for this 2 3 3 3 6 9 particular array
    }
  //these function return the integer value of upper bound, smallest index where arr[i]>=x
    public static int upperBound(int[] arr, int n, int x){
        int ans = n;
        int start = 0; 
        int end = n-1;  
        while(start<=end){ 
            int mid = start + (end - start)/2; 
            if(x==arr[mid]){ // 
                start = mid + 1; 
            }
            else if(arr[mid]<x){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
   //these function return the integer value of lower bound, smallest index where arr[i]>x
    public static int lowerBound(int[] arr, int n, int x){
        int ans = -1;
        int start = 0;
        int end = n-1; 
        while(start<=end){
            int mid = start + (end - start)/2;
            if(x==arr[mid]){
                ans = mid;
                end = mid - 1; 
            }
            else if(arr[mid]<x){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
