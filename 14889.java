// 풀이1
// import java.util.*;
// public class Main{
//   public static void main(String[] args){
//     Scanner scanner = new Scanner(System.in);

//     int n = scanner.nextInt();
//     int[][] lineup = new int[n][n];
//     boolean[] selected = new boolean[n];

//     for(int i = 0; i < 5; i++){
//       for(int j = 0; j < 5; j++){
//         lineup[i][j] = scanner.nextInt();
//       }
//     }

//     int startTeam = 0;
//     int linkTeam = 0;
//     int result_dif = 1000;

//     for(int i = 0; i < n - 1; i++){
//       for(int j = 1; j < n; j++){
//         if(selected[i] && selected[j]){
//           startTeam += lineup[i][j];
//           startTeam += lineup[j][i];
//         }
//         else if(!selected[i] && selected[j]){
//           linkTeam += lineup[i][j];
//           linkTeam += lineup[j][i];
//         }
//         int dif = Math.abs(startTeam - linkTeam);

//         result_dif  = Math.min(dif,result_dif);

//       }
//     }
//     System.out.println(result_dif);


//   }
// }


import java.util.*;
public class Main{

  static int[][] = lineup;
  static int n;
  static boolean[] selected;
  static int target;
  static int answer = Integer.MAX_VALUE;
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    lineup = new int[n][n];
    selected = new boolean[n];
    target = n/2;

    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        lineup[i][j] = scanner.nextInt();
      }
    }
    dfs(0,0)
    System.out.print(answer);
  }

  public static void dfs(int index, int depth){
    if(target == depth) {
      calculate();
      return;
    }
    else {
      for(int i = index; i < n; i++){
        if(!selected[i]){
          selected[i] = true;
          dfs(i+1, depth + 1);
          selected[i] = false;
        }
      }
    }
  }
  public static void calculate(){
    int startTeam = 0;
    int linkTeam = 0;
    
    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
        if(selected[i] && selected[j]){
          startTeam += lineup[i][j];
          startTeam += lineup[j][i];
        }
        else if(!selected[i] && selected[j]){
          linkTeam += lineup[i][j];
          linkTeam += lineup[j][i];
        }
      }
    }
    int dif = Math.abs(startTeam - linkTeam);
    if(dif == 0){
      System.out.print(dif);
      System.exit(0);
    }
    answer = Math.min(answer.dif);
  }
}