import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binArr1 = new String[arr1.length];
        String[] binArr2 = new String[arr2.length];
        String[] bin = new String[n];
        Arrays.fill(binArr1, "");
        Arrays.fill(binArr2, "");
        Arrays.fill(answer, "");
        
        for (int i = 0; i < n; i++) {
            binArr1[i] += Integer.toBinaryString(arr1[i]).toString();
            binArr2[i] += Integer.toBinaryString(arr2[i]).toString();
        }
        
        for (int i = 0; i < n; i++) {
            bin[i] = Integer.toBinaryString(Integer.parseInt(binArr1[i], 2) | Integer.parseInt(binArr2[i], 2));
        }
        
        for (int i = 0; i < n; i++) {
            while (bin[i].length() < n) {
                bin[i] = "0" + bin[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bin[i].length(); j++) {
                if (bin[i].charAt(j) == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }
}