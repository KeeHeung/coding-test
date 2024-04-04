import static java.lang.System.arraycopy;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] tempArray = new int[arr.length];
        int size = 0;
        
		for (int i = 0; i < arr.length; i++) {
			boolean isToDelete = false;
			for (int deleteValue : delete_list) {
				if (arr[i] == deleteValue) {
					isToDelete = true;
					break;
				}
			}
			if (!isToDelete) {
				tempArray[size++] = arr[i];
			}
		}
        
        int[] answer = new int[size];
        arraycopy(tempArray, 0, answer, 0, size);

        return answer;
    }
}