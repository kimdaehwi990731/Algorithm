import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean[] findDup = new boolean[42];
        int cnt = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int	mod = num % 42;
            if (!findDup[mod]) {
            	findDup[mod] = true;
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}