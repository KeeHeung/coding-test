class Solution {
    public int solution(int n) {
        int answer = 0;
		String num = Integer.toString(n);
		for (int i = 0; i < num.length(); i++) {
			String tmp = num.substring(i, i + 1);
			answer += Integer.parseInt(tmp);
		}
        return answer;
    }
}