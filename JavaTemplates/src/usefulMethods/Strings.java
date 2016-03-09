package usefulMethods;

import java.util.*;

/**
 * Created by Tim Kilian on 22.02.16.
 */
public class Strings {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        else if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1, s.length()-1));
    }

    public static boolean isAnagram(String s) {
        return false;
    }

    public static boolean isPangram(String s) {
        List<Character> alphabet = new LinkedList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        for (Character c : s.toLowerCase().toCharArray()) {
            alphabet.remove(c);
            if (alphabet.isEmpty()) return true;
        }
        return false;
    }

    public static boolean isPangram2(String s) {
        Set<Character> alphabet = new HashSet<Character>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c>='a' && c<='z') alphabet.add(new Character(c));
            if (alphabet.size()==26) return true;
        }
        return false;
    }
}
