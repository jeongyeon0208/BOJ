
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case "push" :
                    String num1 = st.nextToken();
                    stack.push(num1);
                    break;
                case "pop" :
                    if (!stack.empty()) {
                        bw.write(stack.pop() + "\n");
                    }
                    else bw.write("-1" + "\n");
                    bw.flush();
                    break;
                case "top" :
                    if (!stack.empty()){
                        bw.write(stack.peek()+ "\n");
                    }
                    else bw.write("-1" + "\n");
                    bw.flush();
                    break;
                case "size" :
                    bw.write(stack.size() + "\n");
                    bw.flush();
                    break;
                case "empty" :
                    String empty = "0";
                    if(stack.empty()) {
                        empty = "1";
                    }
                    bw.write(empty + "\n");
                    bw.flush();
                    break;
                default:
                    break;
            }
        }

    }
}