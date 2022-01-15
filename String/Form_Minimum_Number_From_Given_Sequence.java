package String;

import jdk.swing.interop.SwingInterOpUtils;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Form_Minimum_Number_From_Given_Sequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int j=0;
            int l=0;
            //sc.nextLine();

            String s=sc.next();
            //System.out.println("lenghts="+s.length());
            if(s.charAt(0)=='D')
            {
                for(int k=0;k<s.length()+1;k++)
                {
                    System.out.print(s.length()+1-j);
                    j++;
                }
                System.out.println();

            }

            else
            {
                for(int k=0;k<s.length()+1;k++)
                {
                    System.out.print(1+l);
                    l++;
                }
                System.out.println();
            }
        }
    }
}
