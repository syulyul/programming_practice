class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for (int i = 0; i < keyinput.length; i++) {
            
            switch(keyinput[i]) {
                case "left": 
                    if (answer[0] > board[0] / 2 * (-1)) {
                        answer[0]--;
                    }
                    break;
                case "right":
                    if (answer[0] < board[0] / 2) {
                        answer[0]++;
                    }
                    break;
                case "up":
                    if (answer[1] < board[1] / 2) {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if (answer[1] > board[1] / 2 * (-1)) {
                        answer[1]--;
                    }
                    break;
            }
        
        }
        
        return answer;
    }
}