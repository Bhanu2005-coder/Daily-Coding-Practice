package sorting;
import java.util.*;
public class Quicksort {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Length of the Array :");
      int n=sc.nextInt();
      
      System.out.println("Enter the Elements one by one");
      int arr[]=new int [n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
     int low=0;
     int high=n-1;
     quicksort(arr,low,high);
     for(int i=0;i<n;i++)
     {
        System.out.println(arr[i]);
     }
    }
    public static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
          int pivindx=findpivot(arr,low,high);
          quicksort(arr, low, pivindx-1);
          quicksort(arr, pivindx+1, high);
        }
        return;
    }
    public static int findpivot(int arr[],int low,int high)
    {
        int left=low;
        int pivot=arr[low];
        int right=high;
        while(left<right)
        {
            while(left<=high && arr[left]<=pivot)
            {
                left++;
            }
            while(right>=0 && arr[right]>pivot)
            {
                right--;
            }
            if(left<right)
            {
                swap(arr,left,right);
            }
        }
        swap(arr,low,right);
        return right;
    }
    public static  void swap(int arr[],int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}
