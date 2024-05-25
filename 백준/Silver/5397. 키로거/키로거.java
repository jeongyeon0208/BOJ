
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String str = br.readLine();

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for(int j=0; j<str.length(); j++){
                char c = str.charAt(j);
                switch (c) {
                    case '<':
                        if(!left.empty()){
                            right.push(left.pop());
                        }
                        break;

                    case '>':
                        if(!right.empty()){
                            left.push(right.pop());
                        }
                        break;

                    case '-':
                        if(!left.empty()){
                        left.pop();
                        }
                        break;

                    default:
                        left.push(c);
                }
            }

            while (!left.empty()) {
                right.push(left.pop());
            }
            while (!right.empty()) {
                bw.write(right.pop());
            }
            bw.write("\n");
            bw.flush();

        }
    }
}