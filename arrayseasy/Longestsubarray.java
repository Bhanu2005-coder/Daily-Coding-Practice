import java.util.*;
public class Longestsubarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements one by one:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0;
        int sum=0;
        int max1=0;
        System.out.println("Enter the target sum  :");
        int target=sc.nextInt();
        for(int r=0;r<n;r++)
        {
            sum+=arr[r];
            while(sum>target)
            {
                sum-=arr[left];
                left++;
            }
            if(sum==target)
            {
                max1=Math.max(max1,r-left+1);
            }
        }
    System.out.println(max1);
    }
}
