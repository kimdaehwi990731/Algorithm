import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] basket = new int[N];
		
		for (int m = 0; m < M; m++) {
			int i = sc.nextInt(); // 시작
			int j = sc.nextInt(); // 끝
			int k = sc.nextInt(); // 공 번호
			
			for (int idx = i - 1; idx < j; idx++) {
				basket[idx] = k;
			}
		}
		sc.close();
		
		for (int n = 0; n < N; n++) {
			System.out.print(basket[n] + " ");
		}
		
	}
}