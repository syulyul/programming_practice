import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, Integer> wordToNum = new HashMap<>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};

        StringBuilder numStr = new StringBuilder();
        StringBuilder currWord = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr.append(c);
            } else {
                currWord.append(c);
                if (wordToNum.containsKey(currWord.toString())) {
                    numStr.append(wordToNum.get(currWord.toString()));
                    currWord.setLength(0);
                }
            }
        }

        return Integer.parseInt(numStr.toString());
    }
}
