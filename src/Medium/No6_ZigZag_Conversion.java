package Medium;

import java.util.ArrayList;
import java.util.List;

public class No6_ZigZag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            list.add(new StringBuilder());

        int row = 0;
        boolean down = false;

        for (char ch : s.toCharArray()) {
            list.get(row).append(ch);
            if (row == 0 || row == numRows - 1)
                down = !down;
            row += down ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder st : list)
            res.append(st);

        return res.toString();
    }
}
