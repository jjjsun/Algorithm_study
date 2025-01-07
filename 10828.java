import java.util.*;
import java.io.*;
import java.util.Stack;


public class Stack{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> s = new Stack<>();


    int n = scanner.nextInt();

    for(int i = 0; i < n; i++){
      String word = scanner.next();
  
      if (word.equals("push")){
        int m = scanner.nextInt();
        //정수 넣기
        s.push(m);
      }
      else if(word.equals("pop")){
        //가장 위에꺼 빼고 출력. 없으면 -1출력
        if(s.isEmpty()){
          System.out.println(-1);
        }
        else{
          System.out.println(s.pop());
        }
      }
      else if(word.equals("size")){
        //스택에 있는 정수개수출력
        System.out.println(s.size());
      }
      else if(word.equals("empty")){
        //비어있으면 1, 아니면 0출력
        if(s.isEmpty()){
          System.out.println(1);
        }
        else{
          System.out.println(0);
        }
      }
      else if(word.equals("top")){
        //가장 위에 있는 정수출력. 없으면 -1출력
        if(s.isEmpty()){
          System.out.println(-1);
        }
        else{
          System.out.println(s.peek());
        }
      }
    }
  }
}