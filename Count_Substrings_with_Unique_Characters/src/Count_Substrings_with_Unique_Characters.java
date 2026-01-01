/* Problem Statement: Count Substrings with All Unique Characters

Description:

Given a string s consisting of lowercase English letters, your task is to count the total number of substrings in s such that all characters in the substring are unique (i.e., no character repeats in the substring).

Input:

A string s

Constraints: 1 ≤ s.length ≤ 10^5

The string contains only lowercase English letters ('a'–'z').

Output:

An integer representing the total number of substrings of s where all characters are unique.

Example 1:

Input: s = "abc"
Output: 6
Explanation: The substrings with unique characters are:
"a", "b", "c", "ab", "bc", "abc"


Example 2:

Input: s = "bcada"
Output: 12
Explanation: The substrings with unique characters are:
"b", "c", "a", "d", "a", "bc", "ca", "ad", "da", "bca", "cad", "ada"

Time Complexity (TC)

O(n)

right pointer moves from 0 → n-1

left pointer also moves from 0 → n-1

Each character is added and removed at most once

👉 No nested traversal in practice.

📦 Space Complexity (SC)

O(1)

Fixed-size frequency array of size 26

No extra space dependent on input size*/

public class Count_Substrings_with_Unique_Characters {

    public static int countSubstrings(String s)
    {

        if(s == null || s.length() == 0)
            return 0;

        int left = 0;
        int count = 0;
        int[] freq = new int[26];

        for(int right = 0; right < s.length(); right++)
        {
            freq[s.charAt(right) - 'a']++;

            while(freq[s.charAt(right) - 'a'] > 1)
            {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args)
    {
        String s = "bcada";
        int count = countSubstrings(s);

        System.out.println("The number of substrings with unique characters in " + s + " : " + count);
    }
}
