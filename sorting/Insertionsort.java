package sorting;
import java.util.*;
public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the Elements one By one");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j;
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            for(j=i;j>0 && temp<arr[j-1];j--)
            {
                arr[j]=arr[j-1];
            }
            arr[j]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
