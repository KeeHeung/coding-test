class Solution {
    public String solution(String polynomial) {
        
		String answer = "";
		String[] s = polynomial.split(" \\+ ");

		int x = 0;
		int num = 0;

		for (String term : s) {
			if (term.equals("x")) {
				x++;
			} else if (term.contains("x")) {
				x += Integer.parseInt(term.replace("x", ""));
			} else {
				num += Integer.parseInt(term);
			}
		}

		if (x != 0 && num != 0) {
			answer = (x == 1 ? "" : x) + "x + " + num;
		} else if (x != 0) {
			answer = (x == 1 ? "" : x) + "x";
		} else if (num != 0) {
			answer = String.valueOf(num);
		}
        
        return answer;
    }
}