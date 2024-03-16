import java.util.Scanner;

public class Main{
    public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 1 && a <= 10000 && b >= 1 && b <= 100000) {
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }
    }
}