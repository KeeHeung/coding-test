class Solution {
    public int solution(int a, int b) {
        
        String stringIntAdd = Integer.toString(a) + Integer.toString(b);
		int num1 = Integer.parseInt(stringIntAdd);
        int num2 = 2 * a * b;

        return num1>=num2 ?num1 : num2;
    }
}