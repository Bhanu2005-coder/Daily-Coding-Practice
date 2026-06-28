package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array Elements one by one :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=n-1;
        mergesort(arr,low,high);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void mergesort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
        return;
    }
    public static void  merge(int arr[],int low,int mid,int high)
    {
        ArrayList<Integer>temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left++]);
        }
        while(right<=high)
        {
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }

    }
}
