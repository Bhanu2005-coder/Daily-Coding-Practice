
import java.util.Scanner;

public class Missing {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max1=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          max1=Math.max(arr[i],max1);
          sum+=arr[i];
        }
        int ans=((max1*(max1+1))/2)-sum;
        System.out.println(ans);
    }
}
