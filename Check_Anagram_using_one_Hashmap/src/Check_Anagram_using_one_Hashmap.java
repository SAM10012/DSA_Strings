/*Problem Statement: Check if Two Strings Are Anagrams

Medium

You are given two strings, s1 and s2. Your task is to determine whether they are anagrams of each other.

Two strings are anagrams if they contain the same characters with the same frequency, but possibly in a different order.

The comparison is case-sensitive.

The strings may contain any valid characters (letters, digits, symbols).

Null strings should be handled safely.

 Time Complexity (TC)

O(n)

One pass to count characters of s1

One pass to decrement using s2

Total operations proportional to string length n

Space Complexity (SC)

O(n)

HashMap stores character frequencies

In the worst case, all characters are unique

*/

// ==================================== Approach 2 ==========================================
import java.util.HashMap;

public class Check_Anagram_using_one_Hashmap {

    public static boolean checkAnagram(String s1, String s2)
    {

        if(s1 == null || s2 == null)
            return s1==s2;
        if(s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : arr1)
        {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(char c : arr2)
        {
            if(!map.containsKey(c))
                return false;

            map.put(c,map.get(c) - 1);

            if(map.get(c) == 0)
                map.remove(c);
        }

        return map.isEmpty();
    }

    public static void main(String[] args)
    {
        String s1 = "silent";
        String s2 = "listen";

        boolean check = checkAnagram(s1,s2);

        System.out.println("The two strings are anagrams: " + check);
    }
}
