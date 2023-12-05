class Solution {
    public int solution(int n) {
        String n3 = "";

        while (n > 0) {
            n3 = (n % 3) + n3;
            n /= 3;
        }
        
        n3 = new StringBuilder(n3).reverse().toString();
        
        return Integer.parseInt(n3, 3);
    }
}