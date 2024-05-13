import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numsArr = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                numsArr.add(i);        
            }
        }
        
        int[] answer = new int[numsArr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = numsArr.get(i);
        }
        
        return answer;
    }
}