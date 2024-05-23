
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][6];

        for (int i=0; i< a; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());

            arr[n][m-1]++;
        }

        int ans = 0;

        for (int i=0; i<6; i++){
            ans += (arr[0][i] + b -1 ) /b;
            ans += (arr[1][i] + b - 1) /b;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
    }
}
