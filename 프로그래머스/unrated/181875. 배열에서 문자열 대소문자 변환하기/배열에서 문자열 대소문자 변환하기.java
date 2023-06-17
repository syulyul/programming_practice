class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        String str = "";
        
        for (int i = 0; i < strArr.length; i++) {
            if ((i & 1) == 0) {
                for (int j = 0; j < strArr[i].length(); j++) {
                    str = strArr[i].toLowerCase();
                }
                answer[i] = str;
            } else {
                for (int j = 0; j < strArr[i].length(); j++) {

                   str = strArr[i].toUpperCase();
                }
                answer[i] = str;
        
            }
        }
        return answer;
    }
}