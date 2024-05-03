import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
		ArrayList<String> strList = new ArrayList<>();

		int idx = 0;
		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("r") || str_list[i].equals("l")) {
				idx = i;
				break;
			}
		}
		if (str_list[idx].equals("l")) {
			for (int j = 0; j < idx; j++) {
				strList.add(str_list[j]);
			}
		} else if (str_list[idx].equals("r")) {
			for (int j = idx+1; j < str_list.length; j++) {
				strList.add(str_list[j]);
			}
		}

		String[] answer = new String[strList.size()];
		for (int i = 0; i < strList.size(); i++) {
			answer[i] = strList.get(i);
		}
        
        return answer;
    }
}