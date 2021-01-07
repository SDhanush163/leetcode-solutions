package Easy;

import java.util.Arrays;

public class No14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;

        if (size == 0)
            return "";
        else if (size == 1)
            return strs[0];
        else {
            Arrays.sort(strs);
            int length = strs[0].length();
            StringBuilder res = new StringBuilder();

            for(int i = 0; i < length; i++) {
                if (strs[0].charAt(i) == strs[size - 1].charAt(i))
                    res.append(strs[0].charAt(i));
                else
                    break;
            }
            return res.toString();
        }
    }
}
