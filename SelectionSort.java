
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter array size:");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.println("enter array elements");
       for(int i=0;i<n;i++)
       {
           arr[i]=s.nextInt();
       }
       System.out.println("The array elements are");
      System.out.println(Arrays.toString(arr));
      System.out.println("After insertion sort the array elements are ");

      for(int i=0;i<n-1;i++)
      {
          int min=i;
          for(int j=i+1;j<n;j++)
          {
          if(arr[j]<arr[min])
          {
              min=j;
          }
          }
          int temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
      }
      System.out.println(Arrays.toString(arr));
       
    }
}
