import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        for(int k=1; k<=N; k++) {
            arr[k] = k;
        }

        for (int k=0; k<M; k++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());

            for (int m=i; m<j; m++) {
                int sub = arr[m];
                arr[m] = arr[j];
                arr[j] = sub;
                j--;
            }


        }

        for (int n=1; n<=N ;n++) {
            System.out.print(arr[n]+" ");
        }


    }
}