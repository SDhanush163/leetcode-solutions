package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class No20_Valid_Parenthesis {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> parenthesis = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch))
                parenthesis.push(map.get(ch));
            else if (map.containsValue(ch))
                if (parenthesis.empty() || parenthesis.pop() != ch)
                    return false;
        }
        return parenthesis.empty();
    }
}
