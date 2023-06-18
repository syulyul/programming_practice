class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        
        if (names.length % 5 == 0) {
            answer = new String[names.length / 5];
        } else {
            answer = new String[names.length / 5 + 1];
        }
        
        int k = 0;

        for (int i = 0; i < names.length; i += 5) {
          answer[k] = names[i];
          System.out.println(answer[k]);
          k++;
        }

        return answer;
    }
}