package String;

import java.util.Arrays;
import java.util.Scanner;

public class All_Substring
{
    public static void main (String args[])
    {
        //System.out.println(isPrime(5));

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s=sc.nextLine();
        s=sc.nextLine();
        int count=0;
        //System.out.println("s= "+s);
        boolean a[]=new boolean[n];
        Arrays.fill(a,0,a.length,true);
        //Arrays.fill(a,true);

       // System.out.println(Arrays.toString(a));
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {

                //System.out.println(s.substring(i,j));
                //int k=Integer.parseInt(s.substring(i,j));
                if(isPrime(Integer.parseInt(s.substring(i,j))))
                {
                    //System.out.println(s.substring(i,j));
                    boolean flag=true;
                    for(int k=i;k<j;k++)
                    {
                        if (!a[k])
                        {
                            flag=false;
                        }
                    }
                    if(flag)
                    {
                        //System.out.println(s.substring(i,j));
                        count++;
                        for(int k=i;k<j;k++)
                        {
                            a[k]=false;
                        }
                    }

                }
                //System.out.println(k+100);
            }

        }
        System.out.println("count= "+count);
    }
    //public static String
    public static boolean isPrime(int a)
    {
        if(a==1||a==0)
            return false;
        if(a==2)
            return true;
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;

    }
}

