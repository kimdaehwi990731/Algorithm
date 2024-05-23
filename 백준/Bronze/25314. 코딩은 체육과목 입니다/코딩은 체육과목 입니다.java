import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc  = new Scanner(System.in);

    	int n = sc.nextInt();
    	int div = n / 4;
    	
    	sc.close();
    	
    	for (int i = 0; i < div; i++) {
    		System.out.println("long");
    	}
    	System.out.println("int");
    }
}