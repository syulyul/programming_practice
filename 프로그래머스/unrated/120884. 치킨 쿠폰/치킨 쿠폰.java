class Solution {
    public int solution(int chicken) {
        int coupon = chicken;     // 현재 주문한 치킨 수로 초기화
        int serviceChicken = 0;   // 주문한 서비스 치킨 수

        while (coupon >= 10) {    // 쿠폰으로 서비스 치킨을 주문할 수 있는 동안
            int addChicken = coupon / 10;  // 현재 쿠폰으로 주문할 수 있는 치킨 수
            serviceChicken += addChicken;   // 서비스 치킨 주문
            coupon = coupon % 10 + addChicken; // 남은 쿠폰 수 갱신
        }

        return serviceChicken;
    }
}