import java.util.*;

class Solution {
    public String[] solution(String my_string) {
		List<String> substrings = new ArrayList<>();

		for (int i = 0; i < my_string.length(); i++) {
			substrings.add(my_string.substring(i));
		}
        Collections.sort(substrings);
        
        return substrings.toArray(new String[0]);
    }
}