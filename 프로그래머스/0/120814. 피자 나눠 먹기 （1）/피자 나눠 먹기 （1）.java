class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean number = n >= 1 && n <= 100;
        
        if (number) {
            int needPizzaCount = (n / 7);
            if (needPizzaCount == 1) {
                answer *= needPizzaCount;
            } else if (needPizzaCount == 0){
                answer *= needPizzaCount + 1;
            } else if (n % 7 == 0){
                answer *= needPizzaCount;
            } else {
                answer *= needPizzaCount + 1;
            }
        }
        return answer;
    }
}