//최대값 최소값 구해서 a0 a1 넣고,그다음 최대값 최소값구해서 a2 a3 넣음
//10819
//처음에 절대값을 못보고 너무 쉽게 생각함
import java.util.*;
import java.io.*;

public class Main{
  public static int n;
  public static int[] arr;
  public static int[] ans;
  public static boolean[] visited;
  public static int result;

  public static void dfs(int cnt){
    if(cnt == n){
      int sum = 0;
      for(int i = 0; i < n-1; i++){
        sum += Math.abs(ans[i] - ans[i+1]);
      }
      result = (Math.max(result,sum));
      return;
    }
    for(int i = 0; i < n; i++){
      if(!visited[i]){
        ans[cnt] = arr[i];
        visited[i] = true;
        dfs(cnt+1);
        visited[i] = false;
      }
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();

    arr = new int[n];
    ans = new int[n];
    visited = new boolean[n];
    for(int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
    }
    dfs(0);
    System.out.println(result);
   
  }
}