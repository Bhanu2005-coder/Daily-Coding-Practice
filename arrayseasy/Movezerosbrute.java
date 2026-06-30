import java.util.*;
class Movezerosbrure{
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
        int indx=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                arr[indx]=arr[i];
                indx++;
            }
        }
        while(indx < n)
        {
            arr[indx]=0;
            indx++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}