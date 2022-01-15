package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        for (int i=0;i<n;i++)
        {
            l1.addLast(sc.nextInt());
        }
        for (int i=0;i<m;i++)
        {
            l2.addLast(sc.nextInt());
        }
//        System.out.println(l1);
//        System.out.println(l2);
        sum(l1,l2);
     }
     public static void sum(LinkedList<Integer> l1, LinkedList<Integer> l2)
     {
         int sum1=0;
         int sum2=0;
         for (int i=0;i<l1.size();i++)
         {
             sum1=sum1*10+l1.get(i);
         }
         //System.out.println(sum1);
         for (int i=0;i<l2.size();i++)
         {
             sum2=sum2*10+l2.get(i);
         }
         //System.out.println(sum1+sum2);
         int sum=sum1+sum2;
         LinkedList<Integer> l=new LinkedList<>();
         while(sum>0)
         {
             int temp=sum%10;
             l.addFirst(temp);
             sum=sum/10;
         }
         for (int i=0;i<l.size();i++)
         {
             System.out.print(l.get(i)+" ");
         }

     }
}
