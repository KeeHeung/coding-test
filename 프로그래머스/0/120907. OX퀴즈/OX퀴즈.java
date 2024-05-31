class Solution {
    public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {

			String[] str = quiz[i].split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[2]);
			int z = Integer.parseInt(str[4]);

			switch (str[1]) {
				case "+" : answer[i] = (x + y == z) ? "O" : "X";
				break;
				case "-" : answer[i] = (x - y == z) ? "O" : "X";
				break;
			}
			
		}
        return answer;
    }
}