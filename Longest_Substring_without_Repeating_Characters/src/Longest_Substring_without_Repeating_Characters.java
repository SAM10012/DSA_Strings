/* Longest Substring Without Repeating Characters

You are given a string s.
Your task is to find the length of the longest substring that contains no repeating characters.

🔹 Notes

A substring is a contiguous sequence of characters.

The input string contains only lowercase English letters (a–z).

✅ Approach (Sliding Window)

Use two pointers left and right to represent a sliding window.

Maintain a frequency array to track characters inside the window.

Expand the window by moving right.

If a duplicate character appears, shrink the window from the left until all characters are unique.

Track the maximum window size during traversal.

⏱ Time Complexity (TC)
O(n)


Each character is visited at most twice:

Once when added to the window

Once when removed from the window

No nested traversal.

📦 Space Complexity (SC)
O(1)

*/

public class Longest_Substring_without_Repeating_Characters {

    public static int longestSubstring(String s)
    {

        if(s == null || s.length() == 0)
            return 0;

        int left = 0;
        int maxlen = 0;
        int[] freq = new int[26];

        for(int right = 0; right < s.length(); right++)
        {
            freq[s.charAt(right) - 'a']++;

            while(freq[s.charAt(right) - 'a'] > 1)
            {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

//            if((s.substring(left,right+1)).length() > maxlen)
//            {
//                maxlen = (s.substring(left,right+1)).length();
//            }

            // Improvement on above substring logic
            if((right - left + 1) > maxlen)
                maxlen = (right - left + 1);
        }

        return maxlen;
    }

    public static void main(String[] args)
    {
        String s = "abcabcda";

        int count = longestSubstring(s);

        System.out.println("The length of the longest substring without repeating characters is: " + count);
    }
}
