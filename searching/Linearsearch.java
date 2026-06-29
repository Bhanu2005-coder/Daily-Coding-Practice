package searching;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target Element :");
        int target=sc.nextInt();
        boolean found=true;
        for(int i=0;i<n;i++)
        {
            if(target==arr[i])
            {
                System.out.println("Element found at index"+" "+i);
                found=false;
            }
        }
        if(found)
        {
            System.out.println("Not Found");
        }
    }
}
