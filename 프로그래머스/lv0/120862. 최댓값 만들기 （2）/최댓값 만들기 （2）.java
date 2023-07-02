class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;
        int max = -100000000;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp = numbers[i] * numbers[j];
                if (max < temp) {
                    max = temp;
                }
            }
        }
        answer = max;
        
        return answer;
    }
}