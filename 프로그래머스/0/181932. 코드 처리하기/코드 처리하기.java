class Solution {
    public String solution(String code) {
		StringBuilder sb = new StringBuilder();
		int mode = 0;
		for (int i = 0; i < code.length(); i++) {
			if (mode == 0 && code.charAt(i) != '1' && i % 2 == 0) {
				sb.append(code.charAt(i));
			} else if (mode == 0 && code.charAt(i) == '1'){
				mode = 1;
			} else if (mode == 1 && code.charAt(i) != '1' && i % 2 != 0) {
				sb.append(code.charAt(i));
			} else if (mode == 1 && code.charAt(i) == '1'){
				mode = 0;
			}
		}
		if (sb.substring(0, sb.length()).isEmpty()) {
			sb.append("EMPTY");
		}
        return sb.toString();
    }
}