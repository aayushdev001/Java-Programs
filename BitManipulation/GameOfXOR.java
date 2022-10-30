package BitManipulation;

import java.util.Scanner;

//Given an array of integers, we need to get the total XOR of all subarray XORs where subarray XOR can be obtained
//by XORing all elements of it.
//Input : arr[] = [3, 5, 2, 4, 6]
//Output : 7
//Total XOR of all subarray XORs is,
//        (3) ^ (5) ^ (2) ^ (4) ^ (6)
//        (3^5) ^ (5^2) ^ (2^4) ^ (4^6)
//        (3^5^2) ^ (5^2^4) ^ (2^4^6)
//        (3^5^2^4) ^ (5^2^4^6) ^
//        (3^5^2^4^6) = 7

public class GameOfXOR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<a.length; i++) a[i] = sc.nextInt();
        System.out.println(XOR(a));
    }
    public static int XOR(int[] a)
    {
        int ans = 0;
        for(int i=0; i<a.length; i++)
        {
            int freq = (i+1)*(a.length-i);

            ans = freq%2!=0 ? ans^a[i] : ans;
        }
        return ans;
    }
}
