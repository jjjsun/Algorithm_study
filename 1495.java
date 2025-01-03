import java.util.*;
import java.io.*;

public class Main{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt(); //.곡의 개수
    int s = scanner.nextInt(); // 시작볼륨
    int m = scanner.nextInt(); // 가장 큰 볼륨
    int[] change = new int[n];


    for(int i = 0; i < n; i++){
      change[i] = scanner.nextInt();
    }

    boolean[][] dp = new boolean[n+1][m+1];
    dp[0][s] = true;
    
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
          if (dp[i - 1][j]) {
              if (j + change[i - 1] <= m) {
                  dp[i][j + change[i - 1]] = true;
              }
              if (j - change[i - 1] >= 0) {
                  dp[i][j - change[i - 1]] = true;
              }
          }
      }
    }
    int ans = -1;
    for (int j = 0; j <= m; j++) {
      if (dp[n][j]) {
          ans = Math.max(ans, j);
      }
    }
    System.out.println(ans);  
  }
}