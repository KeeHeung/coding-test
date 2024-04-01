class Solution {
    public int solution(int n, String control) {
        int answer = 0;
		for (int i = 0; i < control.length(); i++) {
			char valOfCon = control.charAt(i);
			if (valOfCon == 'w') {
				n += 1;
			} else if (valOfCon == 's') {
				n -= 1;
			} else if (valOfCon == 'd') {
				n += 10;
			} else if (valOfCon == 'a') {
				n -= 10;
			}
		}
        answer = n;
        return answer;
    }
}