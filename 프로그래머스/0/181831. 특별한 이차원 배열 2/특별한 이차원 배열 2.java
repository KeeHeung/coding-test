class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != arr[j][i]) {
					sb.append("0");
				} else {
					sb.append("1");
				}
			}
		}
		if (!sb.toString().contains("0")) {
			answer = 1;
		}
        return answer;
    }
}