import java.util.*;
class HelloWorld {
      static void romanLetter(int num)
      {
          int temp=num;
int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
    StringBuilder b=new StringBuilder();
    for(int i=0;i<values.length;i++)
    {
        while(num>=values[i])
        {
            num=num-values[i];
            b.append(roman[i]);
        }
    }
      System.out.println("The roman number for "+temp+"is "+b.toString());
}
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        romanLetter(a);
    }
}
