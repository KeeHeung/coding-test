import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int nSize = n / 4;
        String longType = "long ";
        String intType = "int";
        String res = "";
        
        for (int i = 0; i < nSize; i++) {
            res += longType;
        }
        System.out.println(res + intType);

    }
}