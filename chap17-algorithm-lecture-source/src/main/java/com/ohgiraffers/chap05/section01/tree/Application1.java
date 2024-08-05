package com.ohgiraffers.chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* 수업목표. 트리(Tree) 알고리즘을 활용하는 예제를 이해할 수 있다. */
/* 필기.
 *  그래프에서 계층적인 구조를 나타내기 위해 최상위 노드인 루트(root) 노드에서 시작하여
 *  하위 노드들로 분기하는 방식으로 구성된 알고리즘이다.
* */
public class Application1 {

    static int N;
    static int[] parent;
    static boolean[] isVisit;
    static StringTokenizer st;
    static List<Integer>[] list;
    static StringBuilder sb = new StringBuilder();

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        sb.delete(0, sb.length());                      // 알고리즘과는 무관하나 테스트 코드 환경이라 작성

        N = Integer.parseInt(br.readLine());

        isVisit = new boolean[N + 1];
        list = new ArrayList[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        /* 설명. N-1 줄의 입력을 처리 */
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        for (int i=)

        return null;
    }

    private static void dfs(int parenNode) {
        /* 설명. 이미 방문한 노드들은 부모 노드들이고 부모노드들은 재방문 하지 않도록 함 */
        isVisit[parenNode] = true;

        /* 설명. 입력받은 값을 통해 생성된 list(관련있는 노드들) 로부터 정보 확인 */
        for (int node : list[parenNode]) {
            if (!isVisit[node]) {
                parent[node] = parenNode;       // 이 줄 부터는 childnode를 의미

                dfs(node);
            }
        }
    }



}
