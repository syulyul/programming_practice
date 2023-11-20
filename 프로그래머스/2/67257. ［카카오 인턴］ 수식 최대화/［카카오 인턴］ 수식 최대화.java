import java.util.*;

class Solution {
    
    private static final String[][] preferences = {
        "+-*".split(""),
        "+*-".split(""),
        "-+*".split(""),
        "-*+".split(""),
        "*+-".split(""),
        "*-+".split(""),
    };
    
    private long calculate(long left, long right, String op) {
        // 두 피연산자와 연산자를 입력받아 연산 결과를 반환하는 메서드
        return switch (op) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            default -> 0;
        };
    }
    
    private long calculate(List<String> tokens, String[] preference) { 
        // 연산자 우선 순위를 이용하여 계산하는 메서드
        for (String op : preference) {
            for (int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i).equals(op)) {
                    long left = Long.parseLong(tokens.get(i - 1));
                    long right = Long.parseLong(tokens.get(i + 1));
                    long ret = calculate(left, right, op);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i - 1, String.valueOf(ret));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }
    
    public long solution(String expression) {
        
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
        
        long max = 0;
        for (String[] preference : preferences) {
            long value = Math.abs(calculate(new ArrayList<>(tokens), preference));
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}