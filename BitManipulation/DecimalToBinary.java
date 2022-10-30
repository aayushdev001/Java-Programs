package BitManipulation;

import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.print(d2B(i)+" ");
        }
    }
    public static String d2B(int n)
    {
        String ans = "";
        while(n!=0)
        {
            int rem = n%2;
            ans = rem + ans;
            n /= 2;
        }
        return ans;
    }
}
