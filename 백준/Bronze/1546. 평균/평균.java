import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 시험 본 과목의 수
        int[] scoreArr = new int[N]; // 시험 점수 배열(모음)
        int maxScore = -1; // 최고 점수 초기화

        // 성적 입력 받기 + 배열에 저장 + maxScore 설정
        for (int n = 0; n < N; n++) {
            int originScore = sc.nextInt();
            scoreArr[n] = originScore;
            if (scoreArr[n] > maxScore) {
                maxScore = scoreArr[n];
            }
        }
        sc.close();
        
        double sum = 0; // 합계 초기화

        // 합계 계산
        for (int n = 0; n < N; n++) {
            sum += (double) scoreArr[n] / maxScore * 100;
        }

        double newAVG = sum / N;
        System.out.println(newAVG);
    }
}