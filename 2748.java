import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long[] numArray = new long[91];
    numArray[0] = 0;
    numArray[1] = 1;
    for(int i = 2; i < 91; i++){
      numArray[i] = numArray[i-1] + numArray[i-2];
    }

    int n = scanner.nextInt();
    long result = numArray[n];
    System.out.println(result);
  }
}