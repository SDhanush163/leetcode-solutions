package Easy;

import java.util.HashMap;
import java.util.Map;

public class No13_Roman_To_Integer {
    public int romanToInt(String s) {
        char[] key = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < key.length; i++) {
            map.put(key[i], value[i]);
        }

        int prev = map.get(s.charAt(0));
        int num = 0;
        for(int i = 1; i < s.length(); i++){
            int curr = map.get(s.charAt(i));
            if(curr > prev)
                num -= prev;
            else
                num += prev;

            prev = curr;
        }

        num += prev;
        return num;
    }
}
