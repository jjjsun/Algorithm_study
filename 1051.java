//시도1
// import java.util.*;

// public class Main{
//   public static void main(String[] args){
//     Scanner scanner = new Scanner(System.in);

//     int col = scanner.nextInt();
//     int row = scanner.nextInt();

//     Int board[] = new Int[col];
//     for(int i = 0; i < col; i++){
//       board[i] = scanner.next();
//     }
//     if (col >= row){
//       int min = row;
//     }
//     else {
//       int min = col;
//     }
//     int result = 0;

//     for (int i = 0; i < min; i++){
//       if(board[i].indexOf(i) == board[i].indexOf(i+min) && board[i].indexOf(i) == board[i+min].indexOf(i+min) && board[i].indexOf(i) == board[i+min].indexOf(i)){
//         int sqar_size = min * min; 
//         if (sqar_size > result){
//           int result = sqar_size;
//         }
//       }
//     }
//     System.out.println(result);

    
//   }
// }
//board를 int로 하면 개별적으로 나눠서 저장해야함. 문자열로 받아들여서 숫자를 연속된 문자열 형태로 하는것이 간단함.
//int로 하면 한줄을 문자열로 받은후 문자를 숫자로 변환해서 저장해야되는 번거로움이 생김.


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
    int min = Math.min(col,row);
    int result = 0;


    for(int size = 1; size <= min; size++){
      for (int i = 0; i <= col - size; i++){
        for(int j = 0; j <= row - size; j++){
          char top_left = board[i].charAt(j);
          char top_right = board[i].charAt(j + size - 1);
          char bottom_left = board[i + size -1].charAt(j);
          char bottom_right = board[i + size -1].charAt(j + size -1);

          if (top_left == top_right && top_left == bottom_left && top_left == bottom_right){
            result = Math.max(result,size);
          }
        }
      }
    }
    System.out.println(result * result);    
  }
}