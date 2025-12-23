/*
* Problem Statement: Reverse Words in a String

You are given a string s consisting of words separated by single spaces.

Your task is to reverse the order of the words in the string while keeping the characters in each word unchanged.

There are no leading or trailing spaces in the input string.

Input

A single string s

Output

A string where the words appear in reverse order
*
*
* Time Complexity (TC)
O(n)


Splitting the string takes O(n)

Reversing and appending words takes O(n)

Each character is processed once

Space Complexity (SC)
O(n)


Extra space for the String[] words

Extra space for the output StringBuilder
*
* */

public class Reverse_Words_in_String {

    public static String reverseString(String str)
    {
        String[] words = str.split(" ");
        StringBuilder rev = new StringBuilder();

        for(int i= words.length - 1; i>= 0; i--)
        {
            rev.append(words[i]);
            rev.append(" ");
        }

        return rev.toString();
    }

    public static void main(String args[])
    {
        String s = new String("I will be a Google SDE one day");

        String rev = reverseString(s);

        System.out.println("The reversed string is: " + rev.toString().trim());


    }
}
