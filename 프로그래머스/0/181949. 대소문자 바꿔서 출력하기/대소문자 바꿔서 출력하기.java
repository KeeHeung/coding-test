import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        StringBuilder toggled = new StringBuilder(input.length());
        
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        
        System.out.println(toggled.toString());
    }
}