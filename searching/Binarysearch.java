package searching;
import java.util.*;
public class Binarysearch {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the Array :");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target Element :");
    int target=sc.nextInt();
    int low=0;
    int high=n-1;
    int mid;
    int found=-1;
    while(low<=high)
    {
        mid=(low+high)/2;
        if(target==arr[mid])
        {
            System.out.println("Element found at the index "+mid);
            found=1;
            break;
        }
        else if(target<arr[mid])
        {
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    if(found == -1)
    {
        System.out.println("Element Not Found");
    }
}
}
