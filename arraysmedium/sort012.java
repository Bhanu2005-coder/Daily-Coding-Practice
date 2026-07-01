package arraysmedium;

import java.util.Scanner;

public class sort012 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void swap(int arr[],int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
