package Easy;

public class No38_Count_and_Say {
    public String countAndSay(int n) {
        String res = "1";
        for (int i = 2; i <= n; i++)
            res = say(res);
        return res;
    }

    private String say(String str) {
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();
        while (j <= str.length()) {
            while (j < str.length() && str.charAt(i) == str.charAt(j))
                j++;
            result.append(j - i).append(str.charAt(i));
            i = j;
            j++;
        }
        return result.toString();
    }
}
