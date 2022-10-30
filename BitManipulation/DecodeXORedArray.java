package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

//There is a hidden integer array arr that consists of n non-negative integers.
//
//        It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
//
//        You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
//
//        Return the original array arr. It can be proved that the answer exists and is unique.
//
//
//
//        Example 1:
//
//        Input: encoded = [1,2,3], first = 1
//        Output: [1,0,2,1]
//        Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]

public class DecodeXORedArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int endoded[] = {6,2,7,3};
        int first = 4;
        System.out.println(Arrays.toString(decode(endoded, first)));
    }
    public static int[] decode(int[] a, int f)
    {
        int[] ans = new int[a.length+1];
        ans[0] = f;

        for(int i=1; i<ans.length; i++)
        {
            ans[i] = ans[i-1]^a[i-1];
        }
        return ans;
    }
}
