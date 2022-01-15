package String;

import java.util.Scanner;

public class Max_Frequency_Character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        char c='i';
        StringBuilder s1=new StringBuilder();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            if(count==max)
            {
                s1.append(s.charAt(i));
            }
            if(count>max)
            {
                s1.delete(0,s1.length());
                s1.append(s.charAt(i));
                max =count;
                c=s.charAt(i);

            }
        }
        //System.out.println(max);
        //System.out.println(c);
        System.out.println(s1);
    }

}
