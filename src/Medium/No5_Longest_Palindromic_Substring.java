package Medium;

public class No5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s)
    {
        char[] chars = s.toCharArray();
        if (chars.length < 2)
            return s;

        for (int i = chars.length; i > 1; i--)
            for(int j = 0; j < (chars.length - i + 1); j++)
                if(isPalindrome(chars, j, (j + i - 1)))
                    return new String(chars, j, i);
        return String.valueOf(chars[0]);
    }

    boolean isPalindrome(char[] chars, int left, int right)
    {
        while(left < right)
        {
            if(chars[left] != chars[right])
                return false;
            ++left;
            --right;
        }
        return true;
    }
}
