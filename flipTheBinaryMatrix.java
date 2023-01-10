// Flipping the matrix means converting all 1's to 0's and all 0's to 1's.
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the number of rows
        int m = sc.nextInt(); //the number of columns
        int[][] arr= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==1){ //converting all 1's to 0
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=1; //converting all 0's to 1
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" "); //printing the matrix
            }
            System.out.println(); 
        }
        
    }
}
