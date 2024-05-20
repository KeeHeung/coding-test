class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strList = my_string.split(" ");
		for (int i = 0; i < strList.length; i++) {
			if (strList[i].equals("+")) {
                if (i > 2) {
                    answer += Integer.parseInt(strList[i + 1]);
                } else {
                    answer = Integer.parseInt(strList[i - 1]) + Integer.parseInt(strList[i + 1]);    
                }
			}
			if (strList[i].equals("-")) {
                if (i > 2) {
                    answer -= Integer.parseInt(strList[i + 1]);
                } else {
                    answer = Integer.parseInt(strList[i-1]) - Integer.parseInt(strList[i+1]);    
                }
			}
		}
        return answer;
    }
}