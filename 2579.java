import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int stairs_num = scanner.nextInt();
    int[] dp = new int[stairs_num+1];
    int[] stairs = new int[stairs_num+1];
    for(int i = 1; i <= stairs_num; i++){
      stairs[i] = scanner.nextInt();
    }
    dp[1] = stairs[1];
    if(stairs_num >= 2){
      dp[2] = stairs[1] + stairs[2];
    }
    for(int i = 3; i <= stairs_num; i++){
      dp[i] = Math.max(dp[i-2],dp[i-3]+stairs[i-1]) + stairs[i];
    }
    System.out.println(dp[stairs_num]);
  }
}