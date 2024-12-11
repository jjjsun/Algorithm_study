import java.util.Scanner;
import java.util.ArrayList;

public class 10448 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();

    for(int i = 1; ; i++){
      int Num = i * (i+1) / 2;
      if (Num > 1000) break;
      array.add(Num);

     }
    int k = scanner.nextInt();
      
    for(int a = 0; a < k;a++){
      int num = scanner.nextInt();
      boolean found = false;
      for(int j = 0; j < array.size() && !found; j++){
        for(int z = j; z < array.size() && !found; z++){
          for(int x = z; x < array.size() && !found; x++){
            if(array.get(j) + array.get(z) + array.get(x) == num){
              found = true;
              break;
            }
          }
        }      
      }
      if (found) {
        System.out.println(1);
      }
      else {
        System.out.println(0);
      }
    }
  }
}