import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

        H += T / 60;
        M += T % 60;
        
        if(M >= 60){
            H += 1;
            M -= 60;
        }
        if(H >= 24){
            H -= 24;
        }
        
        System.out.println(H + " " + M);
    }
}