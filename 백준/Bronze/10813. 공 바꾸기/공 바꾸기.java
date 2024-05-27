import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] basket = new int[N];
		
		// basket 구성
		for (int idx = 0; idx < N; idx++) {
			basket[idx] = idx + 1;
		}
		int ii = 0;
		int jj = 0;
		
		for (int m = 0; m < M; m++) {
			int i = sc.nextInt(); // 교환1
			int j = sc.nextInt(); // 교환2
			
			ii = basket[i-1];
			jj = basket[j-1];
			
			basket[i-1] = jj;
			basket[j-1] = ii;
		}
		sc.close();
		
		for (int n = 0; n < N; n++) {
			System.out.print(basket[n] + " ");
		}
		
	}
}