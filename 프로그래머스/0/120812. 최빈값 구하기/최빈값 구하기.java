class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] numsForCheck = new int[1000];
        
        for (int i = 0; i < array.length; i++) {
            numsForCheck[array[i]]++;
        }
        
        int countMaxSameNum = numsForCheck[0];

        for (int i = 1; i < numsForCheck.length; i++){
            if (countMaxSameNum < numsForCheck[i]){
                countMaxSameNum = numsForCheck[i];
                answer = i;
            } else if (countMaxSameNum == numsForCheck[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}