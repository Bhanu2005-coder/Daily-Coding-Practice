import java.util.*;
public class LeftRotate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the how many times :");
        int k=sc.nextInt();
        k=k%n;
        while(k>0)
        {
            int temp=arr[0];
            for(int i=0;i<n-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[n-1]=temp;
            k--;
        }
        System.out.println("printing after rotating elements :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
