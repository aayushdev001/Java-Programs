package BitManipulation;

import java.util.Scanner;

public class XORQuerriesOfSubarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++) a[i] = sc.nextInt();
        int querry[] = new int[2];

        for(int i=0; i<q; i++)
        {
            querry[0] = sc.nextInt();
            querry[1] = sc.nextInt();
            int ans = a[querry[0]];
            for(int j=querry[0]+1; j<=querry[1]; j++)
                ans = (ans^a[j]);

            System.out.print(ans+" ");
        }
    }
}
