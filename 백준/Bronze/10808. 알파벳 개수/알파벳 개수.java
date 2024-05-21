import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++){
            int c = str.charAt(i) - 'a';
            arr[c]++;
        }

        for(int i=0; i<26; i++){
            bw.write(arr[i] + " ");
            bw.flush();
        }
    }
}