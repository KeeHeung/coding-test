import java.util.*;

public class Main {
    public static void main(String[] args){
        
		Scanner sc = new Scanner(System.in);

		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int highestNum = Math.max(Math.max(dice1, dice2), dice3);

		int reward = 0;
		boolean isFinish = false;

		while (!isFinish) {
			if (dice1 == dice2 && dice2 == dice3) {
				reward = 10000 + (dice1 * 1000);
				System.out.println(reward);
				isFinish = true;
			} else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
				if (dice1 == dice2 || dice1 == dice3) {
					reward = 1000 + dice1 * 100;
					System.out.println(reward);
				} else {
					reward = 1000 + dice2 * 100;
					System.out.println(reward);
				}
				isFinish = true;
			} else {
				reward = highestNum * 100;
				System.out.println(reward);
				isFinish = true;
			}
		}       
        
    }
}