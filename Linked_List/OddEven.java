package Linked_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            ll.addLast(sc.nextInt());
        }
        f(ll);
        //System.out.println(Arrays.toString(ll.toArray()));
    }
    public static void f(LinkedList<Integer> ll)
    {
        for (int i=0;i<ll.size();i++)
        {
            if (ll.get(i)%2!=0)
            {
                System.out.print(ll.get(i)+" ");
            }
        }
        for (int i=0;i<ll.size();i++)
        {
            if (ll.get(i)%2==0)
            {
                System.out.print(ll.get(i)+" ");
            }
        }
    }
}
