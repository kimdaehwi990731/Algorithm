import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char input = sc.nextLine().charAt(0);
        sc.close();
        
        int cvtAsciiCode = (int)input;
        System.out.println(cvtAsciiCode);
    }
}