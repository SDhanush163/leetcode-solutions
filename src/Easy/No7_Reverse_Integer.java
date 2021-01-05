package Easy;

public class No7_Reverse_Integer {
    public int reverse(int x) {
        int res = 0, newRes;
        while (x != 0) {
            int unit = x % 10;
            newRes = res * 10 + unit;
            if ((newRes - unit) / 10 != res)
                return 0;
            res = newRes;
            x /= 10;
        }
        return res;
    }
}
