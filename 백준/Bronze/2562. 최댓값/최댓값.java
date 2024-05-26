import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArr  = new int[9];
		int max = 0;
		int idx = 0;
		
		for (int i = 0; i < intArr.length; i++) {
			int a = sc.nextInt();
			intArr[i] = a;
			if (intArr[i] > max) {
				max = intArr[i];
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx + 1);
	}
}