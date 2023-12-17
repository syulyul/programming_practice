import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] bin = new String[n];
        
        for (int i = 0; i < n; i++) {
            bin[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        
        for (int i = 0; i < n; i++) {
            while (bin[i].length() < n) {
                bin[i] = "0" + bin[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            answer[i] = bin[i].replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}