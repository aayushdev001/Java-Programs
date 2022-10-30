package BitManipulation;

import java.util.Scanner;

public class SwapEvenAndOddBits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(swapBits(n));
    }
    public static int swapBits(int n)
    {
        int oddBits = (n & 0x55555555); //This converts hexadecimal to binary. It will preserve all the odd bits
        oddBits = oddBits << 1;
        int evenBits = (n & 0xAAAAAAAA); //Similarily this will preserve all the even bits.
        evenBits = evenBits >> 1;

        return oddBits | evenBits;
    }
}
