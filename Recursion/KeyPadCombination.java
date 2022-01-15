package Recursion;
import java.util.*;
public class KeyPadCombination
{
    public static void main(String[] args) {
        // TODO Auto-generate

    }
    //public static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static String[] map = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

    public static ArrayList<String> keyPadC(String digits,ArrayList<String> al)
    {
        if(digits.length()==0)
        {
            ArrayList<String> b=new ArrayList<>();
            b.add("");
            return b;
        }
        else
        {
            char ch=digits.charAt(0);
            ArrayList<String> rr=keyPadC(digits.substring(1),al);
            ArrayList<String> ans=new ArrayList<>();
            String s=map[ch-'0'];
            for (int i=0;i<s.length();i++)
            {
                for (int j=0;j< rr.size();j++)
                {
                    ans.add(s.charAt(i)+rr.get(j));
                }
            }
            return ans;
        }
    }

}
