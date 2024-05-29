import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		
		str = str.trim();

		if (str.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		String[] strArr = str.split("\\s+");
		System.out.println(strArr.length);
	}
}