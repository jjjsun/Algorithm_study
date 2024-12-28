import java.util.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
  static int n;
  static int k;
  static int[] visited = new int[100001]; //최단 시간
  static int[] ways = new int[100001]; //최단 경로 개수

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    k = scanner.nextInt();

    if(n == k){
      System.out.println(0); //최단 시간
      System.out.println(1); //최단 방법
      return;
    }
    else{
      bfs(n);
      System.out.println(visited[k] - 1);
      System.out.println(ways[k]);
    }
  }

  static void bfs(int num){
    Queue<Integer> q = new LinkedList<>();
    q.add(num);
    visited[num] = 1;
    ways[num] = 1;

    while(!q.isEmpty()){
      int temp = q.poll();

      for(int i = 0; i < 3; i++){
        int next;

        if(i == 0){
          next = temp + 1;
        }
        else if(i == 1){
          next = temp - 1;
        }
        else{
          next = temp * 2;
        }

        if(next >= 0 && next < visited.length){
          if(visited[next] == 0){
            visited[next] = visited[temp] + 1;
            ways[next] = ways[temp];
            q.add(next);
          }
          else if(visited[next] == visited[temp] + 1){
            ways[next] += ways[temp];
          }
        }
      }
    }
  }
}