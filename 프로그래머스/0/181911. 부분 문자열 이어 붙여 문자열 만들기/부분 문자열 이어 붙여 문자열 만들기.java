class Solution {
    public String solution(String[] my_strings, int[][] parts) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < my_strings.length; i ++) {
			for (int j = 0; j < parts[i].length; j+=2) {
				answer.append(my_strings[i].substring(parts[i][j], parts[i][j+1] + 1));
			}
		}
        return answer.toString();
    }
}