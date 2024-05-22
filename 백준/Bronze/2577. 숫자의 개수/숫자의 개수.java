
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] arr1 = new int[3];
        int[] arr2 = new int[10];

        for(int i=0; i<3; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        int n = arr1[0] * arr1[1] * arr1[2];

        String m = String.valueOf(n);

        for(int i=0; i<m.length(); i++){
            arr2[m.charAt(i) - '0']++;
        }

        for(int i=0; i<10; i++){
            System.out.println(arr2[i]);
        }
    }
}
