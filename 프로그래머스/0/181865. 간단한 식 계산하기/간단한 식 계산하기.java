class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] nums = binomial.split(" ");
		if ( nums[1].equals("+") ) {
			answer = Integer.parseInt(nums[0]) + Integer.parseInt(nums[2]);
		} else if ( nums[1].equals("-") ) {
			answer = Integer.parseInt(nums[0]) - Integer.parseInt(nums[2]);
		} else if ( nums[1].equals("*") ) {
			answer = Integer.parseInt(nums[0]) * Integer.parseInt(nums[2]);
		} else {
			answer = 0;
		}
        return answer;
    }
}