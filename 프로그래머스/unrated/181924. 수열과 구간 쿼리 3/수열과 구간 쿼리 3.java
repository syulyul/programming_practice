class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] query = new int[queries.length];
        int[] temp = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
          query = queries[i];

          for (int j = 0; j < query.length - 1; j++) {
            temp[j] = arr[query[j]];
            arr[query[j]] = arr[query[j + 1]];
            arr[query[j + 1]] = temp[j];
          }
        }
        answer = arr;
        
        return answer;
    }
}