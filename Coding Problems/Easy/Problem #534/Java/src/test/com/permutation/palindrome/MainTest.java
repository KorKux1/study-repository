package test.com.permutation.palindrome;

import main.com.permutation.palindrome.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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


}