/* Problem Statement — Valid Anagram

You are given two strings s and t.

Your task is to determine whether the two strings are anagrams of each other.

Two strings are said to be anagrams if they contain the same characters with the same frequencies, regardless of order.

🔹 Input

String s

String t

🔹 Output

true if s and t are anagrams

false otherwise

🔹 Example

Input

s = "anagram"
t = "nagaram"


Output

true


Input

s = "rat"
t = "car"


Output

false

⏱ Time Complexity (TC)

O(n)

Each character in both strings is processed once

No sorting is performed

📦 Space Complexity (SC)

O(1)

Uses a fixed-size frequency array (size 26 for lowercase English letters)

Space does not depend on input size*/

public class Check_Anagram_using_Frequency_Count {

    public static boolean checkAnagram(String s, String t)
    {
        if(s == null || t == null)
        {
            return s==t;
        }

        if(s.length() != t.length())
            return false;

        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i : freq)
        {
            if(i != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        String s = "listen";
        String t = "silent";

        boolean check = checkAnagram(s,t);

        System.out.println("The two strings are anagrams: " + check);
    }
}
