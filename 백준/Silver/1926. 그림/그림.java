import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;
    public static int[][] graph;
    public static boolean[][] visited;
    public static int count = 0;
    public static int max = 0;

    public static int dfs(int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || graph[i][j] == 0) {
            return 0;
        }

        visited[i][j] = true;
        int area = 1; // 현재 위치 포함

        // 상하좌우 탐색
        area += dfs(i - 1, j);
        area += dfs(i + 1, j);
        area += dfs(i, j - 1);
        area += dfs(i, j + 1);

        return area;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    int area = dfs(i, j);
                    count++;
                    if (area > max) {
                        max = area;
                    }
                }
            }
        }

        System.out.println(count + "\n" + max);
    }
}