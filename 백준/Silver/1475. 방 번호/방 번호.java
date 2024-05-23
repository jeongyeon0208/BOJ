
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();

        int anw = 0;
        int[] arr = new int[11];

        for (int i=0; i<n.length(); i++){
            int num = n.charAt(i) - '0';
            if (num == 6 || num == 9){
                arr[6]++;
            }
            else{
                arr[num]++;
            }
        }
        arr[6] = (arr[6] + 1) / 2;
        for(int i=0; i<10;i++){
            if (anw < arr[i]) {
                anw = arr[i];
            }
        }

        bw.write(String.valueOf(anw));
        bw.flush();
    }
}