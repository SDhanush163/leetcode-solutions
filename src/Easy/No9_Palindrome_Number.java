package Easy;

public class No9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        return x - reverse(x) == 0;
    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int unit = x % 10;
            res = res * 10 + unit;
            x /= 10;
        }
        return res;
    }
}
