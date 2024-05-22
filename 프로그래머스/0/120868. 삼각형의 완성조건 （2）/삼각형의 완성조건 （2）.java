class Solution {
    public int solution(int[] sides) {
        
        int minNum = Math.min(sides[0], sides[1]);
		int maxNum = Math.max(sides[0], sides[1]);
        
        return minNum * 2 - 1;
    }
}