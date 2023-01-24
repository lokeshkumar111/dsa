//Given two integer a or b, we need to find the value of a^b recursively. Expected Time Complexity - O(nlogn)
class Main{
    public static int powerFunc(int a, int b){
        if(b==0){
          //recursive function stop here this is our base case 
          // In this case a^b will be a^0, if power of an integer is zero then it always return 1
            return 1;
        }
        return a*powerFunc(a,b-1);
      //we are decreasing b after every time function calls itself 
      //1--> 2*(2^3);
      //2--> 2*2*(2^2);
      //3--> 2*2*2(2^1);
      //4--> 2*2*2*2*(2^0); 2^0 return 1 and recursive function will be stop
      //after that it return the value 2*2*2*2*1, which is 16
    }
  public static void main(String[] args){
        int a = 2;
        int b = 4;
      
      // here a =2 or b=4, So a^b, 2^4, which is 2*2*2*2 = 16 
        System.out.println(powerFunc(a,b)); //it will print 16 
    }
}
