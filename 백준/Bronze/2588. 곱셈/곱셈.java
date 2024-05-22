import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = (B % 10) * A;
		int D = ((B % 100) / 10) * A;
		int E = (B / 100) * A;
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(A * B);
	}
}