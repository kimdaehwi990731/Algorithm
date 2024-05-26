import java.util.Arrays;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] intArr = new int[n];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(intArr);
		System.out.println(intArr[0] + " "+ intArr[n-1]);
	}
}