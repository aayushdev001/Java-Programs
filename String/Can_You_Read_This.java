package String;

import java.util.Scanner;

public class Can_You_Read_This
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                System.out.println();
            }
            System.out.print(s.charAt(i));
        }
    }
}
