package util;

import challenge.Palindrome;

public class TestPalindrome {
    public void test() {
        Palindrome p = new Palindrome();

        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(10));
        System.out.println(p.isPalindrome(21120));
        System.out.println(p.isPalindrome(10201));
    }
}
