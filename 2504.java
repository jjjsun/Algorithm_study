import java.util.*;
import java.io.*;
import java.util.Stack;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String word = scanner.nextLine();
    Stack<Character> s = new Stack<>();
    boolean isBalanced = true;
    int sum = 1;
    int answer = 0;
    for(int j = 0; j < word.length(); j++){
      char c = word.charAt(j);

      if(c == '('){
        s.push(c);
        sum *= 2;
      }
      else if (c == '['){
        s.push(c);
        sum *= 3;
      }
      else{
        if(c == ')'){
          if(s.isEmpty() || s.peek() != '('){
            isBalanced = false;
            break;
          }
          if(word.charAt(j-1) == '('){
            answer += sum;
          }
          s.pop();
          sum /= 2;
        }
        else if(c == ']'){
          if(s.isEmpty() || s.peek() != '['){
            isBalanced = false;
            break;
          }
          if(word.charAt(j-1) == '['){
            answer += sum;
          }
          s.pop();
          sum /= 3;
        }
      }
    }
    if(!isBalanced || !s.isEmpty()){
      System.out.println(0);
    }
    else{
      System.out.println(answer);
    }
  }
}