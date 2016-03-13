package usefulMethods;

import java.util.*;

/**
 * Created by Tim Kilian on 22.02.16.
 */
public class Strings {

    /**
     * Count each character in a string
     * @param s the string
     * @return amount of each character (int[])
     */
    public int[] countCharacters(String s) {
        int[] chars = new int[26];
        for (int i=0; i<s.length(); i++) chars[s.charAt(i)-'a']++;
        return chars;
    }

    /**
     * Sort a String from a-z with insertionsort
     * @param s the string
     * @return sorted string
     */
    public String sortString(String s) {
        String sorted = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            char a = s.charAt(i);
            int j = i;
            while (j>0 && sorted.charAt(j-1)>a) --j;
            sorted = sorted.substring(0, j) + a + sorted.substring(j);
        }
        return sorted;
    }

    /**
     * Invert a string
     * @param s the string
     * @return reversed string
     */
    public String reverse(String s) {
        if (s.length()<=1) return s;
        return s.charAt(s.length()-1) + reverse(s.substring(1, s.length()-1)) + s.charAt(0);
    }

    /**
     * shuffle a string
     * TODO
     * @param s the string
     * @return all possible combinations
     */
    public List<String> shuffle(String s) {
        return null;
    }

    /**
     * Merge two strings
     * TODO
     * @param s1 first string
     * @param s2 second string
     * @return all possible combinations
     */
    public List<String> merge(String s1, String s2) {
        return null;
    }


    /**
     * Check if String is a palindrome
     * @param s the string
     * @return palindrome (bool)
     */
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        else if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1, s.length()-1));
    }

    /**
     * Check if two String are anagrams
     * @param A first string
     * @param B second string
     * @return anagram (bool)
     */
    public static boolean isAnagram(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        } else if (A.isEmpty() && B.isEmpty()) {
            return true;
        } else if (B.contains(String.valueOf(A.charAt(0)))) {
            return isAnagram(A.substring(1), B.replaceFirst(String.valueOf(A.charAt(0)), ""));
        } return false;
    }

    /**
     * Check if String is a pangram (deleting character)
     * @param s the string
     * @return pangram (bool)
     */
    public static boolean isPangram(String s) {
        List<Character> alphabet = new LinkedList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        for (Character c : s.toLowerCase().toCharArray()) {
            alphabet.remove(c);
            if (alphabet.isEmpty()) return true;
        }
        return false;
    }

    /**
     * Check if String is a pangram (adding character)
     * @param s the string
     * @return pangram (bool)
     */
    public static boolean isPangram2(String s) {
        Set<Character> alphabet = new HashSet<Character>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c>='a' && c<='z') alphabet.add(c);
            if (alphabet.size()==26) return true;
        }
        return false;
    }

    /**
     * Devide an anagram. Each character occurs %2==0
     * @param s the anagram
     * @return s/2 half of string
     * @require isAnagram(s)
     */
    public String partitionString(String s) {
        String temp = "";
        while (!s.isEmpty()){
            temp += s.charAt(0);
            s = s.substring(1);
            s = s.replaceFirst(""+s.charAt(0), "");
        }
        return temp;
    }

    /**
     * A substring is a part of string S[i:j] such that i≤j. It is a contiguous slice of the original string.
     * (n*(n+1))/2
     * @param s The String
     * @return Number of substrings
     */
    public static int numberOfSubstrings(String s) {
        return (s.length()*(s.length()+1))/2;
    }

    /**
     * A subsequence is a sequence that can be derived from another sequence by deleting some elements
     * (possibly zero but not all) without changing the order of the remaining elements.
     * 2^n-1
     * @param s The String
     * @return Number of subsequence
     */
    public static double numberOfSubsequence(String s) {
        return Math.pow(2, s.length())-1;
    }

    /**
     * Subset is any unordered set of elements from the original list.
     * 2^n
     * @param s The String
     * @return Number of subsets
     */
    public static double numberOfSubsets(String s) {
        return Math.pow(2, s.length());
    }
}
