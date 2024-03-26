class Solution {
    public String solution(String myString) {
		char[] myCharString = myString.toCharArray();
		for (int i = 0; i < myCharString.length; i++) {
			if (myCharString[i] == 'a' && myCharString[i] != 'A') {
				myCharString[i] = Character.toUpperCase(myCharString[i]);
			} else if (myCharString[i] == 'A') {
                  myCharString[i] = myCharString[i];
            } else {
				myCharString[i] = Character.toLowerCase(myCharString[i]);
			}
		}
        return new String(myCharString);
    }
}