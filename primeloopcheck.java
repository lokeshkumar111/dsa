import java.util.Scanner;
class Main{
//check if number is prime or not
    public static boolean isPrime(int n){
        int count=0; 
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){ //print previous n nubmers
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
