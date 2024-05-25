import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(int i=0; i<str.length(); i++){
            left.push(str.charAt(i));
        }

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String c = st.nextToken();

            if(c.equals("P")) {
                String s = st.nextToken();
                left.push(s.charAt(0));
                continue;
            }

            switch (c){
                case "L":
                    if(!left.empty()){
                        right.push(left.pop());
                    }
                    break;

                case "D":
                    if(!right.empty()){
                        left.push(right.pop());
                    }
                    break;

                case "B":
                    if(!left.empty()){
                        left.pop();
                    }
                    break;

            }
        }
        while(!left.empty()){
            right.push(left.pop());
        }
        while (!right.empty()) {
            bw.write(right.pop());
        }
        bw.flush();
    }
}