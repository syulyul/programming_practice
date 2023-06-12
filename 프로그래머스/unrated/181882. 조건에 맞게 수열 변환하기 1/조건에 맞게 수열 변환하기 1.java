class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] >= 50 && ((arr[i] & 1) == 0)) {
            arr[i] /= 2;
          } else if (arr[i] < 50 && ((arr[i] & 1) == 1)) {
            arr[i] *= 2;
          }
        }
        for (int i = 0; i < arr.length; i++) {
          answer[i] = arr[i];
        }
        
        return answer;
    }
}