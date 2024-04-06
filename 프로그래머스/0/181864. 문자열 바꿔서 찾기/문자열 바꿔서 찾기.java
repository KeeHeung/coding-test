class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
		String changeStr = "";
		for (char c : myString.toCharArray()) {
			if (c == 'A') {
				changeStr += 'B';
			} else if (c == 'B') {
				changeStr += 'A';
			} else {
				changeStr += c;
			}
		}
        if (changeStr.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}