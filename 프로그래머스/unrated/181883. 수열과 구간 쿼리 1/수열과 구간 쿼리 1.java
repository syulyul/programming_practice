class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < queries.length; j++) {
                if (i >= queries[j][0] && i <= queries[j][1]) {
                    arr[i] += 1;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}