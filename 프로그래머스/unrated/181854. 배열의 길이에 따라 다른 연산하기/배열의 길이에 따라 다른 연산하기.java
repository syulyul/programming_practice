class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
    
        if ((arr.length & 1) == 1) {
          for (int i = 0; i < arr.length; i++) {
            if ((i & 1) == 0) {
              answer[i] = arr[i] + n;
            } else {
              answer[i] = arr[i];
            }
          }
        } else {
          for (int i = 0; i < arr.length; i++) {
            if ((i & 1) == 1) {
              answer[i] = arr[i] + n;
            } else {
              answer[i] = arr[i];
            }
          }
        }
        return answer;
    }
}