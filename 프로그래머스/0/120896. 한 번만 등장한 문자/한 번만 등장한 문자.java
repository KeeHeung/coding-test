import java.util.*;

class Solution {
    public String solution(String s) {
		char[] sList = s.toCharArray();

		ArrayList<Character> charArray = new ArrayList<>();
		for (int i = 0; i < sList.length; i++) {
			int cnt = 0;
			for (int j = 0; j < sList.length; j++) {
				if (sList[i] == sList[j]) cnt++;
			}
			if (cnt == 1) charArray.add(sList[i]);
		}

		char[] cList = new char[charArray.size()];
		for (int i = 0; i < charArray.size(); i++) {
			cList[i] = charArray.get(i);
		}
		Arrays.sort(cList);
        
        return new String(cList);
    }
}