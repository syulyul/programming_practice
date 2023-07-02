import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int minusMax = 0;
        int plusMax = 0;
        
        Arrays.sort(numbers);
        minusMax = numbers[0] * numbers[1];
        plusMax = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if (minusMax < plusMax) {
            answer = plusMax;
        } else {
            answer = minusMax;
        }
        
        return answer;
    }
}