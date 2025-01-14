//메모리 초과 뜸. Scanner말고 Buffer사용해야하는것같음.
//다시 시도할것. 기다려.

import java.util.*;
import java.lang.StringBuilder;
public class Main{
  static int n;
  static int h[];
  public class Top {
    int index;
    int height;

    Top(int i, int h){
      this.index = i;
      this.height = h;
    }
  }
  public void InputData(){
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    h = new int[n+1];
    for(int i = 1; i <= n; i++){
      h[i] = scanner.nextInt();
    }
    scanner.close();
  }
  public void Solve(){
    Stack<Top> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    for(int i = 1; i <= n; i++){
      while(!stack.isEmpty() && stack.peek().height <= h[i]){
        stack.pop();
      }
      if(stack.isEmpty()){
        sb.append("0" + " ");
      }
      else{
        sb.append(stack.peek().index+" ");
      }
      stack.push(new Top(i, h[i]));
    }
    System.out.println(sb.toString());
  }
  public static void main(String[] args){
    Main m = new Main();
    m.InputData();
    m.Solve();
  }
}