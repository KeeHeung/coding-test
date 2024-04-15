class Solution {
    public int solution(int[] date1, int[] date2) {
        String numStr1 = "";
        String numStr2 = "";
        for (int i = 0; i < date1.length; i++) {
            numStr1 += Integer.toString(date1[i]);
            numStr2 += Integer.toString(date2[i]);
        }
        
        return Integer.parseInt(numStr1) < Integer.parseInt(numStr2) ? 1 : 0;
    }
}