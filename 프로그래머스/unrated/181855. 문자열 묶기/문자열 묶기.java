class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] len = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            len[strArr[i].length()]++;
        }
        
        for (int i = 0; i < len.length; i++) {
            if (len[i] > answer) {
                answer = len[i];
            }
        }
        
        return answer;
    }
}