package Stacks_and_queues;

import java.util.LinkedList;
import java.util.Queue;

public class First_Negative_Number
{
    public static void main(String[] args) {
        int a[]={12,-1,-7,8,-15,20,43,24};
        firstNeg(a,3);
    }
    public static void firstNeg(int[] a, int k)
    {
        Queue<Integer> qu=new LinkedList<>();
        for (int i=0;i<k;i++)
        {
            if (a[i]<0)
            {
                qu.add(i);
            }
        }
        if (!qu.isEmpty())
        {
            System.out.println("Window starting from "+0+" and ending at "+(k-1)+" : "+a[qu.peek()]);
        }
        else
            System.out.println("Window starting from "+0+" and ending at "+(k-1)+" : "+0);
        for (int i=k;i< a.length;i++)
        {
            if (a[i]<0)
                qu.add(i);
            if(!qu.isEmpty() && qu.peek()<=i-k)
                qu.remove();
            if (!qu.isEmpty())
            {
                System.out.println("Window starting from "+(i-k+1)+" and ending at "+(i)+" : "+a[qu.peek()]);
            }
            else
                System.out.println("Window starting from "+(i-k+1)+" and ending at "+(i)+" : "+0);
        }
    }
}
