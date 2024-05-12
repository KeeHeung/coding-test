import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {

        int[] tempList = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			tempList[i] = emergency[i];
		}
		Arrays.sort(tempList);

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < tempList.length; i++) {
			list.add(tempList[i]);
		}

		ArrayList<Integer> emergencyList = new ArrayList<>();
		for (int i = 0; i < emergency.length; i++) {
			emergencyList.add(emergency[i]);
		}
		
		int[] answer = new int[emergency.length];
		for (int i = 0; i < tempList.length; i++) {
			int max = list.get(list.size() - 1);
			int idx = emergencyList.indexOf(max);
			answer[idx] = i+1;
			list.remove(list.size() -1);
		}

        return answer;
    }
}