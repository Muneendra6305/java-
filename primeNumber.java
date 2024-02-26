// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       System.out.println("Enter a number:");
       int a =s.nextInt();
       int count=2;
       for(int i=2;i<a;i++){
           if((a%i)==0)
           {
               count++;
           }
       }
       if(count>2)
         System.out.println("The given number is a not a prime number");
      else
       System.out.println("The given number is a prime number");
    }
}

