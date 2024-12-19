
//첫번째 풀이->아직 틀림
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);


    int N = scanner.nextInt();
    int[] T = new int[N+1];
    int[] P = new int[N+1];

    for(int i = 1; i <= N; i++){
      T[i] = scanner.nextInt();
      P[i] = scanner.nextInt();
    }

    int max_sum = 0;

    for(int j = 1; j <= N; j++){
      int day = j;
      int sum = 0;
      while (day <= N){
        if (day + T[day] - 1 <= N){
          sum += P[day];
          day += T[day];
        }
        else {
          break;
        }
      }
      max_sum = Math.max(max_sum,sum);
    }
    System.out.println(max_sum);
  }
}


//정답풀이
import java.util.*;
public class Main{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] T = new int[N+1];
    int[] P = new int[N+1];
    int[] dp = new int[N+2];

    for(int i = 1; i <= N; i++){
      T[i] = scanner.nextInt();
      P[i] = scanner.nextInt();
    }

    for(int i = 1; i <= N; i++){
      dp[i + 1] = Math.max(dp[i+1], dp[i]);

      if(i + T[i] - 1 <= N){
        dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
      }
    }
    System.out.println(dp[N + 1]);
  }
}