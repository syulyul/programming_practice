class Solution {
    public int[] solution(int brown, int yellow) {
        
        for (int x = 3; x <= 5000; x++) {
            for (int y = 3; y <= x; y++) {
                int boundary = (x + y - 2) * 2;
                int center = x * y - boundary;
                
                if (brown == boundary && yellow == center) {
                    return new int[] {x, y};
                }
            }
        }
        
        return null;
    }
}