import java.util.*;
public class Consecutive {
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
        int maxcons=0;
        int cons=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                cons++;
                maxcons=Math.max(cons,maxcons);

            }
            else
            {
                cons=0;
            }
        }
        System.out.println(maxcons);
    }
}
