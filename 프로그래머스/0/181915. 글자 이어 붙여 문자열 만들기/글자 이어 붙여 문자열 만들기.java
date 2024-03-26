class Solution {
    public String solution(String my_string, int[] index_list) {
		char[] wordNatural = my_string.toCharArray();
		char[] wordByIdx = new char[index_list.length];
        
		for (int i = 0; i < index_list.length; i++) {
			wordByIdx[i] = wordNatural[index_list[i]];
		}
        return new String(wordByIdx);
    }
}