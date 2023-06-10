class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int temp = 0;

        if (included[0] == true) {
          temp += a;
          answer += temp;
        } else {
          temp += a;
        }
        for (int i = 1; i < included.length; i++) {
          if (included[i] == true) {
            temp += d;
            answer += temp;
          } else {
            temp += d;
          }
        }
        
        return answer;
    }
}