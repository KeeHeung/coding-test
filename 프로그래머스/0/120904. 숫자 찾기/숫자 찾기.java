class Solution {
    public int solution(int num, int k) {
		String nums = Integer.toString(num);
		String[] numbers = nums.split("");
		String j = Integer.toString(k);

		int answer = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].equals(j)) {
				answer = i+1;
				break;
			}
		}
        return answer;
    }
}