import java.util.*;
import java.io.*;

public class Main{
  static int[] numarr;
  static int[] operator = new int[4];
  static int n;
  static int max = Integer.MIN_VALUE;
  static int min = Integer.MAX_VALUE;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    numarr = new int[n];
    for(int i = 0; i < n; i++){
      numarr[i] = scanner.nextInt();
    }

    for(int i = 0; i < n; i++){
      operator[i] = scanner.nextInt();
    }

    dfs(numarr[0], 1);
    System.out.println(max);
    System.out.println(min);
  }

  public static void dfs(int num, int idx){
    if(idx == n){
      max = Math.max(max, num);
      min = Math.min(min, num);
      return;
    }

    for(int i = 0; i < 4; i++){
      if(operator[i] > 0){
        operator[i]--;

        switch(i){

          case 0: dfs(num + numarr[idx], idx + 1); break;
          case 1: dfs(num - numarr[idx], idx + 1); break;
          case 2: dfs(num * numarr[idx], idx + 1); break;
          case 3: dfs(num / numarr[idx], idx + 1); break;
        }
        operator[i]++;
      }
    }
  }
}
//6
//123456
//2111로 예시 들면
//맨처음에 1+2,1-2,1*2,1/2로 나눠지고, 하나하나 안에 다시 (앞에값) + 3, (앞에값)-3, (앞에값)*3,(앞에값)/해서 쭉쭉 내려간다음애ㅔ
//맨 밑에 6까지 간 후에는 그중에서, 최대값 최소값 구하고 다시 5번째로 올라오고 4번째로 올라오고 이렇게 끝나는겨.