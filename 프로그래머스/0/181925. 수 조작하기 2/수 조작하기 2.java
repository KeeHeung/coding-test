class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int idx = numLog.length;
        for(int i = 0; i < numLog.length-1; i++) {
            if (numLog[i+1] - numLog[i] == 1) answer += "w";
            if (numLog[i+1] - numLog[i] == -1) answer += "s";
            if (numLog[i+1] - numLog[i] == 10) answer += "d";
            if (numLog[i+1] - numLog[i] == -10) answer += "a";
        }
        return answer;
    }
}