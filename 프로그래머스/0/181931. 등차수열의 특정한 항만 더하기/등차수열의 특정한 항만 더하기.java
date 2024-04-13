class Solution {
    public int solution(int a, int d, boolean[] included) {
		
		int answer = 0;
        int[] nums = new int[included.length];
		for (int i = 0; i < included.length; i++) {
			if (included[i]) nums[i] = a;
			a += d;
			answer += nums[i];
		}
        return answer;
    }
}