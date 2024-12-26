import java.util.*;
import java.io.*;

public class Main{
  static int[][] treeArray;
  static boolean[][] visited;
  static int n;
  static int apartNum = 0;
  static int[] aparts = new int[25*25];
  static int[] dx = {0, 0, 1, -1};
  static int[] dy = {1, -1, 0, 0};

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();

    treeArray = new int[n][n];
    visited = new boolean[n][n];

    for(int i = 0; i < n; i++){
      String line = scanner.next();
      for(int j = 0; j < n; j++){
        treeArray[i][j] = line.charAt(j) - '0';
      }
    }
    for(int a = 0; a < n; a++){
      for(int b = 0; b < n; b++){
        if(treeArray[a][b] == 1 && !visited[a][b]){
          apartNum++;
          aparts[apartNum] = dfs(a,b);
        }
      }
    }
    
    Arrays.sort(aparts);
    System.out.println(apartNum);

    for(int i = 0; i < aparts.length; i++){
      if(aparts[i] > 0){
        System.out.println(aparts[i]);
      }
    }
  }
  static int dfs(int x, int y){
    visited[x][y] = true;
    int count = 1;

    for(int i = 0; i < 4; i++){
      int nx = x + dx[i];
      int ny = y + dy[i];
      if(nx >= 0 && ny >= 0 && nx < n && ny < n){
        if(treeArray[nx][ny] == 1 && !visited[nx][ny]){
          count += dfs(nx,ny);
        }
      }
    }
    return count;
  }
}