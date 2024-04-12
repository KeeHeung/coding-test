class Solution {
    public int solution(String number) {
        String[] intToString = number.split("");
		int answer = 0;
		for (int i = 0; i < intToString.length; i++) {
			answer += Integer.parseInt(intToString[i]);
		}
        
        return answer % 9;
    }
}