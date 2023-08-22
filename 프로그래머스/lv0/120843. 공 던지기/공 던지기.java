class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        
        while(--k > 0) index += 2;
        
        return numbers[index % numbers.length];
    }
}