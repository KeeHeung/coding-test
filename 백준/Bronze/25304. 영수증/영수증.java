import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        int totalPrice = sc.nextInt();
        int stuffCount = sc.nextInt();
        int a = 0;
        int b = 0;
        int calculatePrice = 0;
        
        for (int i = 0; i < stuffCount; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            calculatePrice += a * b;
        }
        
        if (calculatePrice == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}