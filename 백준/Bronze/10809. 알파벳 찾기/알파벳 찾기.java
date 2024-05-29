import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int[] alphabetPositions = new int[26];
        Arrays.fill(alphabetPositions, -1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (alphabetPositions[index] == -1) {
                alphabetPositions[index] = i;
            }
        }

        for (int position : alphabetPositions) {
            System.out.print(position + " ");
        }
    }
}
