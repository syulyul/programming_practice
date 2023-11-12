class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        
        for (int i = 0; i < quiz.length; i++) {
            String[] qArr = quiz[i].split("\\s+");
            int ret = 0;
            
            if (qArr[1].equals("-")) {
                ret = Integer.parseInt(qArr[0]) - Integer.parseInt(qArr[2]);
            } else if (qArr[1].equals("+")) {
                ret = Integer.parseInt(qArr[0]) + Integer.parseInt(qArr[2]);
            }
            
            if (ret == Integer.parseInt(qArr[4])) {
                answer[idx++] = "O";
            } else {
                answer[idx++] = "X";
            }
        }
        
        return answer;
    }
}