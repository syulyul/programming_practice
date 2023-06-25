class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;
        int max = 0;
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp = numbers[i] * numbers[j];
                if(temp > max) {
                    max = temp;
                    answer = max;
                } else {
                    answer = max;
                }
            }
        }
        
        return answer;
    }
}