import static java.util.Arrays.copyOfRange;

class Solution {
    public int solution(String myString, String pat) {
		char[] myCharArray = myString.toCharArray();

		int idx = 0;
		for (int i = 0; i < myCharArray.length; i++) {
			char[] tmp = copyOfRange(myCharArray, i, i+pat.length());

			String test = "";
			for (int j = 0; j < tmp.length; j++) {
				test += String.valueOf(tmp[j]);
			}
			if (test.contains(pat)) {
				idx++;
			}
		}
        return idx;
    }
}