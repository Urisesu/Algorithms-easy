package challenge;

public class Palindrome {
    public boolean isPalindrome(long num) {
        long revert = 0;
        int mod = 0;

        if (num >= 0 && num < 10) return true;

        while (num / 10 > 0) {
            mod = (int) num % 10;
            num /= 10;

            if (0 == mod && 0 == revert) return false;
            if (num == revert) return true;
            revert = revert * 10 + mod;
            if (num == revert) return true;
        }

        return false;
    }
}
