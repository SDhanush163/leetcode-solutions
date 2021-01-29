package Medium;

public class No8_String_To_Integer_atoi {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;

        int sign = 1;
        int i = 0;
        int res = 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-')
            sign = s.charAt(i++) == '-' ? -1 : 1;

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <=9) {
            boolean isResMaxed = res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10;
            if (res > Integer.MAX_VALUE / 10 || isResMaxed)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (s.charAt(i++) - '0');
        }
        return res * sign;
    }
}
