package Recursion;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Maze_Path
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        mp(n1,n2,n1,n2,"");
        System.out.print(mp2(n1,n2,n1,n2,""));
    }
    public static void mp(int i, int j, int m, int n, String ans)
    {
        if(m==1&&n==1)
        {
            System.out.print(ans+" ");
        }
        else if (m==0||n==0)
        {
            return;
        }
        else
        {
            mp(i, j, m-1,n,ans+"V");
            mp(i, j,m,n-1,ans+"H");
            //mp(i, j,m-1,n-1,ans+"D");
        }
    }
    public static int mp2(int i, int j, int m, int n, String ans)
    {
        if(m==1&&n==1)
        {
            //System.out.println(ans);
            return 1;
        }
        else if (m==0||n==0)
        {
            return 0;
        }
        else
        {
            int count=0;
            count+= mp2(i, j,m,n-1,ans+"H");
            count+= mp2(i, j, m-1,n,ans+"V");
            count+= mp2(i,j, m-1,n-1,ans+"D");
            return count;
        }
    }
}
