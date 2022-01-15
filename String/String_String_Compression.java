package String;

import java.util.Scanner;

public class String_String_Compression
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        int i=0;
        //s1=s1+s.charAt(0);
        while(i<s.length()-1)
        {
            int j=i+1;
            s1=s1+s.charAt(i);
            int count=1;
            System.out.println(s1);
            while(j<s.length() && s.charAt(i)==s.charAt(j))
            {
                j++;
                count++;
            }
            if(count>1)
            {
                s1=s1+String.valueOf(count);
            }
            else
            {
                if(j==s.length()-1)
                {
                    s1 = s1 + s.charAt(j);
                }
                //s1=s1+s.charAt(i+1);
            }
            i=j;
        }
        System.out.println(s1);
    }
}
