import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] dp = new int[n+1];
    //dp[i]는 숫자 i를 1로 만드는데 필요한 최소 연산횟수저장
    //숫자 1은 이미 1이기 때문에 연산 필요없음.
    dp[1] = 0;
    for(int i = 2; i <= n; i++){
      dp[i] = dp[i-1] + 1;

      if (i % 2 == 0){
        dp[i] = Math.min(dp[i],dp[i/2]+1);
      }

      if (i % 3 == 0){
        dp[i] = Math.min(dp[i],dp[i/3]+1);
      }
    }
    System.out.println(dp[n]);
  }
}