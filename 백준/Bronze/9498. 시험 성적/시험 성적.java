import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		if(num1<=100 && num1 >=90) {
			System.out.print("A");
		}
		else if(num1<=89 && num1>=80) {
			System.out.print("B");
		}
		else if(num1<=79 && num1>=70) {
			System.out.print("C");
		}
		else if(num1<=69 && num1 >= 60) {
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}	
	}
}