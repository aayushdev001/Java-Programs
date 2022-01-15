package String;

import java.util.Scanner;

public class Toggle_Case
{
    public static void caseToggle(String s)
    {
        StringBuilder toggled=new StringBuilder(s.length());
        for(int i=0;i<s.length();i++)
        {
            char l=s.charAt(i);
            if(Character.isUpperCase(s.charAt(i)))
            {
                l=Character.toLowerCase(s.charAt(i));
                toggled.append(l);

            }
            else if(Character.isLowerCase(s.charAt(i)))
            {
                l=Character.toUpperCase(s.charAt(i));
                toggled.append(l);
            }
            else
            {
                toggled.append(l);
            }
        }
        System.out.println(toggled);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        caseToggle(s);
    }
}
