import java.util.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
  static int[][] treeArray;
  static boolean[] visited;
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int v = scanner.nextInt();

    //정점(node)는 1부터 시작하기 때문에 n+1로 설정
    treeArray = new int[n+1][n+1];
    for(int i = 0; i < m; i++){
      int a = scanner.nextInt();
      int b = scanner.nextInt();


      //연결된 노드는 1로 설정
      treeArray[a][b] = 1;
      treeArray[b][a] = 1;
    }

    visited = new boolean[n+1];
    DFS(v);
    System.out.println();

    visited = new boolean[n+1];
    BFS(v);
    System.out.println();

  }



  static void DFS(int v){
    //방문한건 true로 설정
    visited[v] = true;
    System.out.print(v + " ");
    if(v == treeArray.length)
      return;
    for(int j = 1; j < treeArray.length; j++){
      //v와 연결되어있는데, 방문 안한(false) 경우
      if(treeArray[v][j] == 1 && visited[j] == false){
        DFS(j);
      }
    }
  }

  static void BFS(int v){
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.offer(v);
    visited[v] = true;

    System.out.print(v + " ");
    while(!queue.isEmpty()){
      int n = queue.poll();

      //노드 하나로 연결된 것 먼저 체크
      for(int i = 1; i<treeArray.length; i++){
        //v와 연결되어있는데, 방문 안한(false) 경우
        if(treeArray[n][i] == 1 && visited[i] == false){
          visited[i] = true;
          System.out.print(i + " ");
          queue.offer(i);
        }
      }
    }
  }
}

