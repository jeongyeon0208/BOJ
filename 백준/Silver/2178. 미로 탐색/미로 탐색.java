import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;
    public static int[][] graph;
    public static boolean[][] visited;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};


    public static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void bfs(int i, int j){

        visited[i][j] = true;

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(i, j));

        while(!q.isEmpty()){
            Node currentNode = q.poll();

            for (int k = 0; k < 4; k++) {
                int newX = currentNode.x + dx[k];
                int newY = currentNode.y + dy[k];

                if (newX < 0 || newX > n-1 || newY < 0 || newY > m-1 || visited[newX][newY] || graph[newX][newY] == 0) {
                    continue;
                }

                q.offer(new Node(newX, newY));
                visited[newX][newY] = true;
                graph[newX][newY] = graph[currentNode.x][currentNode.y] + 1;
            }
        }
        return;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            String[] split = br.readLine().split("");
            for (int j=0; j<m; j++){
                graph[i][j] = Integer.parseInt(split[j]);
            }
        }


        bfs(0, 0);

        System.out.println(graph[n - 1][m - 1]);

    }
}