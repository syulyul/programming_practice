import java.util.*;

class Solution {
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int solution(int a, int b) {
        if (a == 0) return 2; // a가 0인 경우는 무한소수
        int gcd = getGCD(a, b);
        a /= gcd;
        b /= gcd;
        
        while (b > 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2; // 2와 5 이외의 다른 소인수가 존재하면 무한소수
            }
        }
        
        return 1; // 2와 5로만 나누어 떨어지면 유한소수
    }
}