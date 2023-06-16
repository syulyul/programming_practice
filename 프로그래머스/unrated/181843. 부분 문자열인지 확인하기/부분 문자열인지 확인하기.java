class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int k = 0;
        String s = "";

        for (int i = 0; i < my_string.length() - target.length() + 1; i++) {
          s = "";
          for (int j = k; j < k + target.length(); j++) {
            s += my_string.charAt(j);
            if (s.equals(target)) {
              answer = 1;
              return answer;
            }
          }
          k++;
        }
        return answer;
    }
}