import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] arr = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) -  'a'] +=1;
        }
        for(int i=0; i< str2.length(); i++){
            int n = str2.charAt(i) - 'a';
            arr[n] -= 1;
        }
        int ans = 0;
        for(int i=0; i<26; i++){
            ans += Math.abs(arr[i]);

        }
        bw.write(String.valueOf(ans));
        bw.flush();
    }
}