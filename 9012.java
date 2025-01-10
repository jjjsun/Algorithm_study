import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    scanner.nextLine(); //버퍼제거

    for(int i = 0; i < n; i++){
      String word = scanner.nextLine();
      Stack<Character> s = new Stack<>(); //스택 생성
      boolean isBalanced = true; //균형 체크

      for(int j = 0 ; j < word.length(); j++){
        char c = word.charAt(j); //문자열

        if(c == '('){
          s.push(c); //스택에 넣음
        }
        else if(c == ')'){
          if(s.empty()){
            isBalanced = false; //균형 무너졌으니 false로 바꿔주고 멈춤
            break;
          }
          else {
            s.pop(); //비어있지 않으니, (가 있다는뜻. 따라서 pop으로 빼주기
          }
        } //'('는 스택에 넣고, ')'는 '('얘가 있으면 얘를 빼주고, 아니면 균형무너짐
      }
      if(!s.empty()){
        isBalanced = false;
      }
      if(isBalanced){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
  }
}