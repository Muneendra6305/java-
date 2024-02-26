
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       System.out.println("Enter a number:");
       int a =s.nextInt();
       System.out.println("The prime number are:");
      for(int i=1;i<=a;i++)
      {
          if(isPrime(i))
          {
              System.out.println(i);
          }
      }
    }
    static boolean isPrime(int n)
    {
        if(n==0 || n==1)
           return false;
         int count=2;
       for(int i=2;i<=n/2;i++){
           if((n%i)==0)
           {
               count++;
               return false;
           }
       }
     return true;
    }
}

