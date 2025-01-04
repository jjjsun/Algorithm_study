import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] t = new int[n+1];
    int[] p = new int[n+1];
    int[] dp = new int[n+2];

    for(int i = 1; i <= n; i++){
      t[i] = scanner.nextInt();
      p[i] = scanner.nextInt();
    }

    for(int i = 1; i <= n; i++){
      dp[i+1] = Math.max(dp[i+1], dp[i]);

      if(i + t[i]-1 <= n){
        dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i] + p[i]);
      }
    }
    System.out.println(dp[n+1]);
  }
}