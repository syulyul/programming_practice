class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        int idx = 0;
        int[] sub = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                sub[i] = array[i] - n;
            }else {
                sub[i] = n - array[i];
            }
        }
        
        for (int i = 0; i < sub.length; i++) {
            if (sub[i] < min) {
                min = sub[i];
                answer = array[i];
                idx = i;
            } else if (sub[i] == min) {
                if (array[i] > array[idx]) {
                    answer = array[idx];
                } else {
                    answer = array[i];
                }
            }
        }
        
        return answer;
    }
}