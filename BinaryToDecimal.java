import java.util.*;
class BinaryToDecimal{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a binary number");
        String str=s.nextLine();
        int b=binaryToDecimal(str);
        System.out.println("The decimal number for"+str+"is"+b);
    }
    static int binaryToDecimal(String str)
    {
        int result=0;
        int power=1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='1')
            {
                result=result+power;
            }
            power=power*2;
        }
        return result;
    }
}
