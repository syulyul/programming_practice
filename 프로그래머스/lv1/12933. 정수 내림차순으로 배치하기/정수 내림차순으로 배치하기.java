import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] a = str.toCharArray();
        int[] num = new int[a.length];
        String s = "";
        
        for (int i = 0; i < num.length; i++) {
            num[i] = a[i] - '0';
        }
        
        Arrays.sort(num);
        
        for (int i = num.length - 1; i >= 0; i--) {
            s += String.valueOf(num[i]);
        }
        
        answer = Long.parseLong(s);
        
        return answer;
    }
}