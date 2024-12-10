import java.util.Scanner;
import java.util.Arrays;

public class 2309 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] numArray = new int[9];
    int sum = 0;
    
    for(int i = 0; i < 9; i++){
      int n = scanner.nextInt();
      numArray[i] = n;
      sum += n;
    }

    boolean found = false;

    for(int j = 0; j < 8; j++){
      for(int z = j+1; z < 9;z++){
        if(sum-(numArray[j] + numArray[z]) == 100){
          int[] finalArray = new int[7];
          int index = 0;

          for(int a = 0; a < 9; a++){
            if(a != j && a != z){
              finalArray[index++] = numArray[a];
            }
          }
          Arrays.sort(finalArray);
          for(int b = 0; b < 7; b++){
            System.out.println(finalArray[b]);
          }
          found = true;
          break;
        }
      }
      if (found) break;
    }
  }
}


//정렬해줘야함.
//크기가 지정된 배열이라 remove가 따로 안됨,
//그래서 새로운 배열에 저장해줘야함