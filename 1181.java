import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    String[] arr = new String[n];

    for(int i = 0; i < n; i++){
      arr[i] = scanner.next();
    }

    //문자열 정렬
    Arrays.sort(arr, (s1, s2) ->{
      if(s1.length() == s2.length()){
        //compareTo는 문자열 순서로 정렬되도록 설정되어있음.
        return s1.compareTo(s2);
      }
      else{
        //문자열 길이로 정렬
        return s1.length() - s2.length();
      }
    });

    //for문에서 0부터 출력하면 i-1이랑 비교 못하니, 0은 먼저 출력
    System.out.println(arr[0]);

    
    for(int i = 1; i < arr.length; i++){
      //문자열이 같다면 출력안함.
      if(!arr[i].equals(arr[i-1])){
        System.out.println(arr[i]);
      }
    }
  }
}