class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int chkFinished = 0;
		for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) chkFinished++;
		}
        
		int idx = 0;
		String[] answer = new String[chkFinished];
		for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) answer[idx++] = todo_list[i];
		}
        return answer;
    }
}