/* Problem Statement

You are given a string s consisting only of the characters '(' and ')'.

You may delete any characters from the string (possibly none) while keeping the relative order of the remaining characters to form a subsequence.

Your task is to find the length of the longest balanced parentheses subsequence.

A parentheses string is balanced if:

Every opening parenthesis '(' has a corresponding closing parenthesis ')'

Parentheses are matched in the correct order

⏱ Time Complexity (TC)

O(n)

The string is traversed once from left to right

Each character is processed only once

📦 Space Complexity (SC)

O(1)

Only a few integer variables are used

No extra space proportional to input size */

public class Longest_Balanced_Parenthesis_Subsequence {

    public static int checkSubsequence(String s)
    {
        int left = 0;
        int pair = 0;

        for(char c : s.toCharArray())
        {
            if(c == '(')
                left++;
            else if(c == ')' && left > 0)
            {
                pair++;
                left--;
            }
        }

        return pair*2;
    }

    public static void main(String[] args){

        String s = "(((()()))))";

        int count = checkSubsequence(s);

        System.out.println("The longest balanced subsequence in the parenthesis string is: " + count);
    }
}
