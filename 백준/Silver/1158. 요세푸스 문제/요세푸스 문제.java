
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n;i++){
            q.add(i + 1);
        }

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                Integer remove = q.remove();
                if (j == k-1) {
                    arr[i] = remove;
                    break;
                }
                q.add(remove);
            }
        }

        bw.write("<");
        for (int i=0; i<n; i++){
            bw.write(String.valueOf(arr[i]));
            if (i!=n-1) bw.write(", ");
        }
        bw. write(">");
        bw.flush();
    }
}