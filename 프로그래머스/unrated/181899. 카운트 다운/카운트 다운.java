class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];

        int k = 0;
        for (int i = start; i >= end; i--) {
          answer[k++] = i;
        }

        return answer;
    }
}