package String;

import java.util.Scanner;

public class Difference_In_ASCII
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        int i=0;
        while (i<s.length()-1)
        {
            s1=s1+s.charAt(i);
            int d=s.charAt(i+1)-s.charAt(i);
            s1=s1+String.valueOf(d);
            if(i==s.length()-2)
            {
                s1=s1+s.charAt(i+1);
            }

            i++;
        }
        System.out.println(s1);

    }
}
