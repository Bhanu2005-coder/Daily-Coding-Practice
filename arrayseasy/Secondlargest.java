import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max1=arr[0];
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1)
            {
                max2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE)
        {
            System.out.println(-1);
            return;
        }
        System.out.println(max2);
    }
}
