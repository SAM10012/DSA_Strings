/* 📌 Problem Statement: Check Isomorphic Strings

Given two strings s and t, determine whether they are isomorphic.

Two strings are said to be isomorphic if the characters in s can be replaced to get t, such that:

Each character in s maps to exactly one character in t

No two different characters map to the same character

The order of characters is preserved

All occurrences of a character must map to the same character

🔹 Input

Two strings s and t

🔹 Output

Return true if the strings are isomorphic

Return false otherwise

🧠 Approach

If either string is null, return true only if both are null

If the lengths of the strings are different, they cannot be isomorphic

Use two HashMaps:

One to map characters from s → t

One to map characters from t → s

Traverse both strings simultaneously and validate mappings at each index

⏱ Time Complexity (TC)

O(n)

Each character is processed once

n = length of the string

📦 Space Complexity (SC)

O(1)

HashMaps store at most a fixed number of characters

Space is bounded by the character set size (constant)*/

import java.util.HashMap;

public class Check_Isomorphic_Strings_using_HashMap {

    public static boolean checkIsomorphic(String s, String t)
    {
        if(s == null || t== null)
            return s==t;

        if(s.length() != t.length())
            return false;

        HashMap<Character,Character> first_map = new HashMap<>();
        HashMap<Character,Character> second_map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(first_map.containsKey(c1))
            {
                if(first_map.get(c1) != c2)
                    return false;
            }
            else
                first_map.put(c1,c2);

            if(second_map.containsKey(c2))
            {
                if(second_map.get(c2) != c1)
                    return false;
            }
            else
                second_map.put(c2,c1);
        }

        return true;

    }
    public static void main(String[] args)
    {
        String s = "paper";
        String t = "title";

        boolean check = checkIsomorphic(s,t);

        System.out.println("The two strings are Isomorphic: " + check);
    }
}
