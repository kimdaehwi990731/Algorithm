import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	// n = 랜덤이 아니라 입력 받아야 함 다시 ㄱㄱ
    	Scanner sc = new Scanner(System.in);
    	
        int[] student = new int[30];

        for (int i = 0; i < 28; i++) {
            int n;
            boolean isDuplicate;

            do {
                n = sc.nextInt();
                isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (student[j] == n) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            student[i] = n;
        }
        
        for (int num = 1; num <= 30; num++) {
            boolean isPresent = false;
            for (int j = 0; j < 28; j++) {
                if (student[j] == num) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                System.out.println(num);
            }
        }
    }
}
