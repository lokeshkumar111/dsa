// Print the count of total number of such substrings starting and ending with same characters.
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // String
        int n = s.length(); // length of the String
        int count = 0;
        for(int i=0; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                if(isUC(s.substring(i,j))){
                    count++; // count the total number of substring
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isUC(String str){
        boolean check = false;
        int n = str.length();
        for(int i=0; i<n; i++){
            if(str.charAt(0)==str.charAt(n-1)){ // checking if substrings is starting and ending with same characters.
                check = true;
            }
        }
        return check;
    }
}
