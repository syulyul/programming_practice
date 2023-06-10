class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
          if (mode == 0) {
            if (code.charAt(idx) != '1') {
              if ((idx & 1) == 0) {
                answer += code.charAt(idx);
              }
            } else if (code.charAt(idx) == '1') {
              mode = 1;
            }
          } else if (mode == 1) {
            if (code.charAt(idx) != '1') {
              if ((idx & 1) == 1) {
                answer += code.charAt(idx);
              }
            } else if (code.charAt(idx) == '1') {
              mode = 0;
            }
          }
        }
        if (answer.equals("")) {
          answer = "EMPTY";
        }
        
        return answer;
    }
}