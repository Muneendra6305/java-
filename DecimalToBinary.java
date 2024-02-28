import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);  
      System.out.println("Enter a number:");
        int n=s.nextInt();
       decimalToBinary(n);
    }
    static void decimalToBinary(int n)
    {
        int arr[]=new int[1000];
        int i=0;
      while(n>0)
       {
           arr[i]=n%2;
           n=n/2;
           i++;
       }
      for(int j=i-1;j>=0;j--)
      {
          System.out.print(arr[j]+" ");
      }
    }
}
