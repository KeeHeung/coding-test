class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strList = my_string.split(" ");
        int num = Integer.parseInt(strList[0]);
        
        for (int i = 1; i < strList.length; i += 2) {
            String operator = strList[i];
            int nextNum = Integer.parseInt(strList[i + 1]);
            
            if (operator.equals("+")) {
                num += nextNum;
            } else if (operator.equals("-")) {
                num -= nextNum;
            }
        }
        return num;
    }
}