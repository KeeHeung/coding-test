class Solution {
    public String[] solution(String[] names) {
        int countGroup = (names.length + 4) / 5;
        String[] answer = new String[countGroup];
        
		for (int i = 0; i < names.length; i += 5) {
			answer[i/5] = names[i];
			
		}
        return answer;
    }
}