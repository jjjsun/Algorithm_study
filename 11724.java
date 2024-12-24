import java.util.*;
import java.io.*;

public class Main{
  static int[][] treeArray;
  static boolean[] visited;

  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    treeArray = new int[n+1][n+1];
    for(int i = 0; i < m; i++){
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      treeArray[a][b] = 1;
      treeArray[b][a] = 1;
    }

    for(int x = 0; x <= n; x++){
      for(int y = 0; y <= n; y++){
        for(int z = 0; z <= n; z++){
          if(treeArray[y][x] == 1 && treeArray[x][z] == 1){
            treeArray[y][z] = 1;
          }
        }
      }
    }



    visited = new boolean[n+1];
    int count = 0;
    for(int i = 1; i <= n; i++){
      if(visited[i] == true){
        continue;
      }
      for(int j = 1; j <= n; j++){
        if (treeArray[i][j] == 1 && visited[j] == false){
          visited[j] = true;
        }
      }
      count++;
    }
    System.out.println(count);
  }
}