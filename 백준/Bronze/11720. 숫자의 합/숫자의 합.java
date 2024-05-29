import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        String num = sc.nextLine();
        int sum = 0;
    	
        for (int n = 0; n < N; n++) {
        	sum += Character.getNumericValue(num.charAt(n));
        }
        sc.close();
        
        System.out.println(sum);
    }
}
