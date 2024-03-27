class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if (arr1.length > arr2.length) {
            return answer = 1;
        } else if (arr1.length == arr2.length) {
            int arr1Add =0;
            int arr2Add =0;
            
            for (int i = 0; i < arr1.length; i++) {
                arr1Add += arr1[i];
                arr2Add += arr2[i];
            }
            
            if (arr1Add > arr2Add) {
                return answer = 1;
            } else if (arr1Add < arr2Add) {
                return answer = -1;
            } else {
                return answer = 0;
            }
        } else if (arr1.length < arr2.length) {
            return answer = -1;    
        } else {
            return 0;
        }
    }
}