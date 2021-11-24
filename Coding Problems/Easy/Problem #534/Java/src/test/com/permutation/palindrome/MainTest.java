package test.com.permutation.palindrome;

import main.com.permutation.palindrome.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    @DisplayName("Get the permutations of a word should work")
    void getPermutationsOfAWordTest(){
        assertEquals(null, main.getPermutations("Test"), "Get permutations of a single word should work");
    }

    @Test
    @DisplayName("Get if a string is palindrome should work")
    void getIsPalindromeStringCase1(){
        assertTrue(main.isPalindrome("ojo"), "Check if a string is palindrome should work");
    }

    @Test
    @DisplayName("Get if a string is palindrome should work")
    void getIsPalindromeCase2(){
        assertTrue(main.isPalindrome("radar"), "Check if a string is palindrome should work");
    }

    @Test
    @DisplayName("Get if a string is not palindrome should return false")
    void getIsPalindromeCase3(){
        assertFalse(main.isPalindrome("telefono"), "Check if a string is not palindrome should work");
    }

    @Test
    @DisplayName("Get if a string is palindrome should work")
    void getIsPalindromeCase4(){
        assertTrue(main.isPalindrome("racecar"), "Check if a string is palindrome should work");
    }

    @Test
    @DisplayName("Swap two characters of a string should work")
    void swapTest(){
        assertEquals("Halo", main.swap("Hola", 1,3), "Characters swap should work");
    }

    @Test
    @DisplayName("Permute string should work")
    void permuteTest(){
        // HACK: this must separate in text files or json file.
        String str =  "abc";
        ArrayList<String> permutationsExpected = new ArrayList<String>() {
            {
                add("abc");
                add("acb");
                add("bac");
                add("bca");
                add("cab");
                add("cba");
            }
        };

        int n = str.length() -1;
        main.permute(str, 0, n);

        // there is probably a better way for this comparison
        assertTrue(main.getPermutations().containsAll(permutationsExpected) && permutationsExpected.containsAll(main.getPermutations())); // O(n^2)
    }

    @Test
    @DisplayName("Get if String permutations is palindrome should works")
    void checkStringPermutationsIsPalindromeTest(){
        assertTrue(main.getIfAnyStringPermutationIsPalindrome("carrace"), "String permutations has palindrome string should works");
    }

    @Test
    @DisplayName("Get if String permutations is not palindrome should works")
    void checkStringPermutationsIsPalindromeCase2Test(){
        assertFalse(main.getIfAnyStringPermutationIsPalindrome("daily"), "String permutations has not palindrome string should works");
    }




}