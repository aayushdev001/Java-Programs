package Array;

import java.util.*;
public class MaxArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int i,max=0;
        for (i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        //max=arr[0];
        for(i=0;i<5;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);


    }
}