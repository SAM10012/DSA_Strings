/*Problem Statement: Check if Two Strings Are Anagrams

Medium

You are given two strings, s1 and s2. Your task is to determine whether they are anagrams of each other.

Two strings are anagrams if they contain the same characters with the same frequency, but possibly in a different order.

The comparison is case-sensitive.

The strings may contain any valid characters (letters, digits, symbols).

Null strings should be handled safely.

 Time Complexity (TC):

Traversing both strings → O(n + m)

n = s1.length(), m = s2.length()

Comparing HashMaps → O(k) in worst case

k = number of unique characters ≤ n

Overall: O(n) (assuming n ≈ m)

Space Complexity (SC):

Two HashMaps storing character frequencies → O(n)
*/

// ==================================== Approach 1 ==========================================
import java.util.HashMap;

public class Anagrams {

    public static boolean checkAnagram(String s1, String s2)
    {

        if(s1 == null || s2 == null)
            return s1 == s2;
        if(s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();


        for(char i : arr1)
        {
            map1.put(i, map1.getOrDefault(i,0) + 1);
        }

        for(char i : arr2)
        {
            map2.put(i, map2.getOrDefault(i,0) + 1);
        }

        return (map1.equals(map2));

    }

    public static void main(String[] args)
    {
        String s1 = "silent";
        String s2 = "listen";

        boolean check = checkAnagram(s1,s2);

        System.out.println("The two strings are anagrams: " + check);
    }
}
