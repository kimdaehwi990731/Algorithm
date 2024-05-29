import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++) {
            String word = sc.nextLine();
            System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
        }
        sc.close();
    }
}