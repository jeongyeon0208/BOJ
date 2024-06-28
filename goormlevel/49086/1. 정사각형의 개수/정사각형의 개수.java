import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		long n = Integer.parseInt(input);
		long m = n;
		long ans = 0;
		for(int i=1; i<n+1; i++){
			ans += (m - i + 1) * (m - i + 1);
		}
		
		System.out.println(ans);
	}
}