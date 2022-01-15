package String;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int sum=0;
        int i=0;
        int m=1;
        int x=0;
        while(x!=p)
        {
            sum=sum+m*a[i];
            i++;
            x++;
            if((i+1)%a.length==0)
            {
                i=0;
                m++;
            }
        }
        System.out.println(sum);
    }
}
