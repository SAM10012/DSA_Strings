/* Problem Statement: Check if a String Has All Unique Characters (Using ASCII)

You are given a string s consisting of ASCII characters.

Your task is to determine whether all characters in the string are unique.

Use a fixed-size boolean array to track whether a character has appeared before.

If the string contains any repeated character, return false.
If all characters are distinct, return true.

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;

public class All_Unique_Characters_in_String {

    public static boolean checkUnique(String s)
    {

        if(s.length() > 128)
        {
            return false;
        }
        boolean[] check = new boolean[128];

        for(int i=0;i<s.length();i++)
        {
            int ch = s.charAt(i);

            if(check[ch] == true)
                return false;
            else
            {
                check[ch] = true;
            }
        }

        return true;

    }
    public static void main(String[] args)
    {
        String s = "Java";
        System.out.println("All unique characters: " + String.valueOf(checkUnique(s)));
    }
}
