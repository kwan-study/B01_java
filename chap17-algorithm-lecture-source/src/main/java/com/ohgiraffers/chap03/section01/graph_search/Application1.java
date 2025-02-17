package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.StringTokenizer;

/* 수업목표. DFS를 활용(재귀함수)하는 예제를 이해할 수 있다. */
/* 필기.
 *  깊이 우선 탐색(Depth-First Search)
 *   후입 선출 구조에 stack 혹은 재귀함수 활용
 *   한쪽 분기를 정하여 최대 깊이까지 탐색 후 분기를 이동하여 다시 탐색
* */

public class Application1 {

    static boolean[] visit;     // 방문 배열

    static int[][] map;         // 그래프를 2차원 배열로 매핑(인접 리스트)

    static int count = 0;       // 오염된 컴퓨터의 수

    static int node, edge;      // node와 edge의 개념을 저장

    /* 설명. 문자열에서 한 줄씩 읽어들이기 위한 BufferedReader를 반환하는 메소드(readLine()) */
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        /* 설명. 노드와 간선에 대한 정보가 담길 map을 작성(node의 갯수 및 번호에 기반한 int형 2차원 배열) */
        map = new int[node + 1][node + 1];      // 0번 인덱스는 사용하지 않고 인덱스와 노드 번호를 일치 시키기 위한 크기

        /* 설명. 방문 배열 작성(지나갔던 노드를 다시 방문하지 않기 위함. 재귀 호출의 stackoverflow 방지) */
        visit = new boolean[node + 1];          // 방문 배열도 노드 번호와 인덱스 일치 시키기

        for (int i = 0; i < edge; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            /* 설명. 무방향 그래프로 처리되기 위해 노드 번호를 반대로도 적용 */
//            map[row][col] = 1;
//            map[col][row] = 1;
            map[row][col] = map[col][row] = 1;
        }

        dfs(1);

        return count - 1;
    }

    /* 설명. 재귀함수로 dfs 알고리즘을 구현할 메소드 */
    private static void dfs(int start) {
        visit[start] = true;
        count++;

        for (int i = 1; i <= node; i++) {
            if (map[start][i] == 1 && !visit[i])
                dfs(i);
        }
    }

}
