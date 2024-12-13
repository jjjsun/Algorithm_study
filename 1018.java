//import java.util.*;

//방법1
// public class Main {
//   public static void main(String[] args){
//     Scanner scanner = new Scanner(System.in);


//     int col = scanner.nextInt();
//     int row = scanner.nextInt();


//     String [][] = new String[col][row];

//     for(int i = 0; i < n; i++){
//       for(int j = 0; j < m; j++){
//         array[i][j] = scanner.next();
//       }
//     }
//     // for(int i = 0; i < n; i++){
//     //   for(int j = 0; j < m; j++){
//     //     array[i][j] = scanner.next();
//     //   }
//     // }
//     int count = 0;
//     for(int a = 0;)
//     for(int z = 0; z < m-1;z++){
//       if(array[0][z] == 'B'){
//         if(array[0][z+1] == 'B'){
//           array[0][z+1] = 'W'
//           count ++;
//         }
//       }
//       else {
//         if(array[0][z+1] == 'W'){
//           array[0][z+1] = 'B'
//           count ++;
//         }
//       }
//       for(int i = 0; i < n-7; i++){
//         for(int j = 0; j < n-7; j++){

//         }
//       }
//     }
//   }
// }



//방법2
// import java.util.*;

// public class Main{
//   public static void main(String[] args){
//     Scanner scanner = new Scanner(System.in);

//     int col = scanner.nextInt();
//     int row = scanner.nextInt();
//     String board[] = new String[col];
//     for(int i = 0; i < col; i++){
//       board[i] = scanner.next();
//     }
//     int min = Integer.MAX_VALUE;
//     int cnt1, cnt2;

//     for(int i = 0; i < col-7; i++){
//       for(int j = 0; j < row-7; j++){
//         cnt1 = 0;
//         cnt2 = 0;
//         for(int p = i; p < i+8; p++){
//           for(int q = j; q < j+8; q++){
//             if(p % 2 == 0){
//               if(q % 2 == 0){
//                 //1번줄, 2번줄로 본거구나
//                 //이차원 배열로 본게 아니라
//                 //1번줄 몇번째. 이렇게 배열로 봤네
//                 if(board[p].charAt(q) == 'W'){
//                   cnt1++;
//                 }
//                 else{
//                   cnt2++;
//                 }
//               }
//               else{
//                 if(board[p].charAt(q) == 'B'){
//                   cnt1++;
//                 }
//                 else{
//                   cnt2++;
//                 }
//               }
//             }
//             else{
//               if(q % 2 == 0){
//                 if(board[p].charAt(q) == 'B'){
//                   cnt1++;
//                 }
//                 else{
//                   cnt2++;
//                 }
//               }
//               else{
//                 if(board[p].charAt(q) == 'W'){
//                   cnt1++;
//                 }
//                 else{
//                   cnt2++;
//                 }
//               }
//             }
//           }
//         min = Math.min(min,Math.min(cnt1,cnt2));
//         }
//       }
//     }
//     System.out.println(min);
//   }
// }





//방법3
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int col = scanner.nextInt();
    int row = scanner.nextInt();
    String board[] = new String[col];
    for(int i = 0; i < col; i++){
      board[i] = scanner.next();
    }
    int min = Integer.MAX_VALUE;
    int cnt1, cnt2;  // WBW , BWB

    for(int i = 0; i < col-7; i++){
      for(int j = 0; j < row-7; j++){
        cnt1 = 0;
        cnt2 = 0;
        for(int p = i; p < i+8; p++){
          for(int q = j; q < j+8; q++){
            if ((p + q) % 2 == 0){ //짝수캄
              if (board[p].charAt(q) != 'W') cnt1++;
              if (board[p].charAt(q) != 'B') cnt2++;
            }
            else { // 홀수칸
              if (board[p].charAt(q) != 'B') cnt1++;
              if (board[p].charAt(q) != 'W') cnt2++;
            }
          }
        }
        min = Math.min(min,Math.min(cnt1,cnt2));
      }
    }
    System.out.println(min);
  }
}