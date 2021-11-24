package main.com.permutation.palindrome;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Permutations checker");
    }


    /**
     * Get if a any permutation of a String is a Palindrome
     * @param str
     * @return
     */
    public boolean getIfAnyStringPermutationIsPalindrome(String str){
        return false;
    }


    /**
     * Given a string get all Permutations.
     * @param sentence is the string from which you want to obtain its permutations.
     * @return a list with all string permutations.
     */
    public ArrayList<String> getPermutations(String sentence) {
        // TODO
        return null;
    }

    /**
     * Return if a string is palindrome.
     * @param str is the string that want verify if its palindrome.
     * @return true if palindrome, false opposite case.
     */
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        return str.equalsIgnoreCase(reverseString);
    }


}
