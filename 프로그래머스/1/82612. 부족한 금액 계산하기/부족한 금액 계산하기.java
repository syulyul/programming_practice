class Solution {
    public long solution(int price, int money, int count) {
        long need = 0;
        
        for (int i = 0; i < count; i++) {
            need += price * (i + 1);
        }
        if (need - money < 0) {
            return 0;
        }
        
        return need - money;
    }
}