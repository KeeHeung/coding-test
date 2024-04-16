class Solution {
    public String solution(String my_string, int[] indices) {
        String[] myStringList = my_string.split("");
		for (int idx : indices) {
			myStringList[idx] = "";
		}
        return String.join("", myStringList);
    }
}