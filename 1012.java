// import java.util.*;
// import java.io.*;

// public class Main{
//   static int[][] treeArray;

  // public static void main(String[] args){
  //   Scanner scanner = new Scanner(System.in);

  //   int t = scanner.nextInt();
    
  //   for(int i = 0; i < t; i++){
  //     int m = scanner.nextInt();
  //     int n = scanner.nextInt();
  //     int k = scanner.nextInt();

  //     treeArray = new int[m][n];
  //     for(int a = 0; a < m; a++){
  //       for(int b = 0; b < n; b++){
  //         treeArray[a][b] = 0;
  //       }
  //     }
  //     for(int q = 0; q < k; q++){
  //       int x = scanner.nextInt();
  //       int y = scanner.nextInt();
  //       treeArray[x][y] = 1;
  //     }
  //     int count = 0;

  //     for(int a = 0; a < m; a++){
  //       for(int b = 0; b < n; b++){
  //         if(treeArray[a][b] == 1){
  //           if(treeArray[a-1][b] != 2 && treeArray[a+1][b] != 2 && treeArray[a][b-1] != 2 && treeArray[a][b+1] != 2){
  //             treeArray[a][b] = 2;
  //             count++;
  //           }
  //         }
  //       }
  //     }
  //     System.out.println(count);
  //   }
  // }
// }

import java.util.*;
import java.io.*;

public class Main{
  static int[][] treeArray;
  static boolean[][] visited;
  static int n,m;
  static int[] dx = {-1, 1, 0, 0};
  static int[] dy = {0, 0, -1, 1};
  
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();
    
    for(int i = 0; i < t; i++){
      m = scanner.nextInt();
      n = scanner.nextInt();
      int k = scanner.nextInt();

      treeArray = new int[m][n];
      visited = new boolean[m][n];

      for(int j = 0; j < k; j++){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        treeArray[x][y] = 1;
      }
      int count = 0;

      for(int a = 0; a < m; a++){
        for(int b = 0; b < n; b++){
          if(treeArray[a][b] == 1 && !visited[a][b]){
            dfs(a,b);
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }


  static void dfs(int x, int y){
    visited[x][y] = true;

    for(int i = 0; i < 4; i++){
      int nx = x + dx[i];
      int ny = y + dy[i];
      if(nx >= 0 && ny >= 0 && nx < m && ny < n){
        if(treeArray[nx][ny] == 1 && !visited[nx][ny]){
          dfs(nx,ny);
        }
      }
    }
  }
}