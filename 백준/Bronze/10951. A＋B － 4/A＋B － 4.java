import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			StringTokenizer st; // 문자열 분리
			String str = "";
			
			while ((str=br.readLine()) != null) { // readline(): 문자열 저장
				st = new StringTokenizer(str);
				if (st.hasMoreTokens()) {
                    bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
				} else {
					break;
				}
			}
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}