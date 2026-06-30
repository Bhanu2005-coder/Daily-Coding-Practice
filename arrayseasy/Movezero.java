import java.util.*;
public class Movezero {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the Array :");
       int n=sc.nextInt();
       System.out.println("Enter the Array Elements one by one :");
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       int slow=0;
       for(int fast=0;fast<n;fast++)
       {
        if(arr[fast]!=0)
        {
            int temp=arr[slow];
            arr[slow]=arr[fast];
            arr[fast]=temp;
            slow++;
        }
       }
       for(int i=0;i<n;i++)
       {
        System.out.println(arr[i]);
       }
    }
}
