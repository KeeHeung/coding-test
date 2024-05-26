class Solution {
    public int[] solution(String[] keyinput, int[] board) {
		int[] answer = {0, 0};

		int upMax = board[1] / 2;
		int downMax = (board[1] / 2) * -1;
		int rightMax = board[0] / 2;
		int leftMax = (board[0] / 2) * -1;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (answer[1] < upMax) answer[1]++;
                    break;
                case "down":
                    if (answer[1] > downMax) answer[1]--;
                    break;
                case "right":
                    if (answer[0] < rightMax) answer[0]++;
                    break;
                case "left":
                    if (answer[0] > leftMax) answer[0]--;
                    break;
            }
        }

        return answer;
    }
}