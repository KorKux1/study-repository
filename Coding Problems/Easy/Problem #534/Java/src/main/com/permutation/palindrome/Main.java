package main.com.permutation.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private static ArrayList<String>  permutations;

    public Main(){
        permutations = new ArrayList<String>();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startProgram();
    }

    private void startProgram(){
        System.out.println("Welcome to Palindrome Permutations checker");
        System.out.println("Enter a string");
        String str = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = reader.readLine();
        } catch (IOException error){
            System.out.println("It was not possible to read the string entered");
        }
        boolean result = getIfAnyStringPermutationIsPalindrome(str);

        System.out.println(result);
    }

    /**
     * Get if a any permutation of a String is a Palindrome
     * @param str string value
     * @return true if any permutation of the string is a palindrome
     */
    public boolean getIfAnyStringPermutationIsPalindrome(String str){
        int n = str.length() -1;
        permute(str, 0, n);

        boolean isPalindrome = false;

        for (int i = 0; i <= permutations.size() -1 && !isPalindrome; i++){
            if(isPalindrome(permutations.get(i))){
                isPalindrome = true;
            }
        }

        return isPalindrome;
    }

    /**
     * Swap string characters at position
     * @param str string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String str, int i, int j){
        char[] stringCharArray = str.toCharArray();
        char temp = stringCharArray[j];
        stringCharArray[j] = stringCharArray[i];
        stringCharArray[i] = temp;
        return String.valueOf(stringCharArray);
    }

    /**
     * Recurvise function to get all permutations
     * @param str string to calculate permutation for
     * @param start starting index
     * @param end end index
     */
    public void permute(String str, int start, int end){
        if(start == end) {
            permutations.add(str);
        } else {
            for (int i = start; i <=end; i++){
                str = swap(str, start, i);
                permute(str, start+1, end);
                str = swap(str, start, i);
            }
        }
    }

    /**
     * Given a string get all Permutations.
     * @param sentence is the string from which you want to obtain its permutations.
     * @return a list with all string permutations.
     */
    public ArrayList<String> getPermutations(String sentence) {
        return null;
    }

    /**
     * Return if a string is palindrome.
     * @param str is the string that want verify if its palindrome.
     * @return true if string is palindrome, false opposite case.
     */
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        return str.equalsIgnoreCase(reverseString);
    }

    public ArrayList<String> getPermutations() {
        return permutations;
    }
}
