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
		StringBuffer result = new StringBuffer();
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				int number = Integer.parseInt(st.nextToken());
				if (number < x) {
					result.append(number).append(" ");
				}
			}
			if (result.length() > 0) {
				result.setLength(result.length() - 1);
			}
			bw.write(result.toString());
			bw.newLine();
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getMessage();
		}
	}
}