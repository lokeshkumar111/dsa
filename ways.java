/*Sandhya is running up a staircase with n steps, and she can jump either 1, 2, or 3 steps at a time 
you have to count, how many possible ways Sandhya can run up the stairs.*/
class Main{
  //function ways count the number of ways, Sandhya can run up the stairs.
    public static int ways(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return ways(n-1)+ways(n-2)+ways(n-3);
    }
    public static void main(String[] args){
        int n = 4; //number of steps
        System.out.println(ways(n));
    }
}
