class Solution {
    public int solution(int order) {
        int answer = 0;
		char[] c = Integer.toString(order).toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '3' || c[i] == '6' || c[i] == '9') {
				answer++;
			}
		}
        return answer;
    }
}