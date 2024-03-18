class Solution {
	public static double solution(int[] numbers) {

		boolean cond = numbers.length >= 1 && numbers.length <= 100;

		double answer = 0;
		int sum = 0;
		if (cond) {
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
		}
		return answer = (double) sum / numbers.length;
	}
}