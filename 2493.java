//2493
//처음에 stack으로 받고,
//그럼 맨위에 있는게 4니까, 4랑 7비교해서 위에 있는게 더 작거나 같으면,
//그 수 출력해서 새로운 스택에 넣는거야. 그러면 새로운 스택 맨위에 있는게 예씨에서 보면 4잖아.
//그럼 그 스택에서 맨위에 있느것 부터 꺼내서 출력하면 다시 원래 순서대로 00224로 나오겠지

// import java.util.*;
// import java.io.*;
// import java.util.Stack;

//Stack
// public class Main{
//   public static void main(String[] args){
//     Scanner scanner = new Scanner(System.in);
//     Stack<Integer> top = new Stack<>();
    
//     int size = scanner.nextInt();
//     for(int i = 1 ; i <= size; i++){
//       int a = scanner.nextInt();
//       if(top.isEmpty()){
//         System.out.println(0);
//         top.push(a);
//       }
//       else{
//         while(true){
//           if(top.isEmpty())
//         }
//       }
//       while(!top.isEmpty()){
//         if(top.peek() >= a){

//         }
//       }
//     }


//   }
// }


import java.util.*;
import java.io.*;
import java.util.Stack;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Stack<Int[]> stack = new Stack<>();
    int n = scanner.nextInt();
    int[] heights = new int[n];
    int[] result = new int[n];


    for(int i = 0 ; i < n; i++){
      height[i] = scanner.nextInt();
      while (!stack.isEmpty() && stack.peek()[0] < height[i]) {
        stack.pop();
      }

      if (!stack.isEmpty()) {
          result[i] = stack.peek()[1] + 1;
      } else {
          result[i] = 0;
      }

      stack.push(new int[] { height[i], i });
    }
    for (int r : result) {
      System.out.print(r + " ");
    }
  }
}
