/*You are given an array A of size N, and Q queries to deal with. For each query, you are given
an integer X, and you're supposed to find out if X is present in the array A or not.*/
//O(nlongn)
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //size of array
        int q= sc.nextInt(); //number of queries
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<q; i++){
            int x = sc.nextInt();
            if(isPresentInArray(arr, n, x)>-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static int isPresentInArray(int[] arr, int n, int x){
        int start=0;
        int end= n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==x){
                return mid; //return index if find 
            }
            else if(arr[mid]>x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1; //if not present in the array retrun -1
    }
}
