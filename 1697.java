import java.util.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
  static int n;
  static int k;
  static int[] visited = new int[100001];

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    k = scanner.nextInt();

    if (n==k){
      System.out.println(0);
      return;
    }
    else{
      bfs(n);
    }
  }
  static void bfs(int num){
    Queue<Integer> q = new LinkedList<>();
    q.add(num);
    visited[num] = 1;
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
        else {
          next = temp * 2;
        }
        if(next == k){
          System.out.println(visited[temp]);
          return;
        }
        if(next >= 0 && next < visited.length && visited[next] == 0){
          q.add(next);
          visited[next] = visited[temp] + 1;
        }
      }
    }
  }
}