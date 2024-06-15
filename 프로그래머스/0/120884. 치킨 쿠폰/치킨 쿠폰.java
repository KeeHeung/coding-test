class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
		int coupon = chicken;
		int leftCoupon = 0;
		int totalChicken = 0;

		while(coupon + leftCoupon >= 10) {
			int ableOrder1 = (coupon + leftCoupon) / 10;
			int ableOrder2 = (coupon + leftCoupon) % 10;

			coupon = ableOrder1;
			leftCoupon = ableOrder2;
			totalChicken += coupon;
		}
		answer = totalChicken;
        
        return answer;
    }
}