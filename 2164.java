//Queue 기본문제
import java.util.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    Queue<Integer> q = new LinkedList<Integer>();

    for(int i = 1; i <= n; i++){
      q.offer(i);
    }

    while(q.size() != 1){
      q.poll(); //맨 앞에 원소 버림
      q.offer(q.poll()); // 맨앞 원소 버리면서 맨뒤로 넣기
    }

    System.out.println(q.poll());
  }
}