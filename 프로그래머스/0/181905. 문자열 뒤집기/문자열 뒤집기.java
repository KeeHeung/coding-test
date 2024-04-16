class Solution {
    public String solution(String my_string, int s, int e) {
		String[] strList = my_string.split("");
		String[] tmp = new String[e - s + 1];

		int idx = 0;
		for (int i = s; i <= e; i++) {
			tmp[idx++] = strList[i];
		}

		int idx1 = 0;
		for (int i = 0; i < tmp.length; i++) {
			strList[s+idx1] = tmp[tmp.length - i - 1];
			idx1++;
		}

		my_string = "";
		for (int i = 0; i < strList.length; i++) {
			my_string += strList[i];
		}
        
        return my_string;
    }
}