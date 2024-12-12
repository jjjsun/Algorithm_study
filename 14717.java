import java.util.Scanner;

public class 14717 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int total_sum = 153;
    int count = 0;
    int target = (a + b) % 10;
    if (a == b){
      float result = (float) (total_sum - (10 - a)) / total_sum;
      System.out.printf("%.3f", result);
    }
    else {
      for(int i = 1; i <= 10; i++){
        for(int j = i+1; j <= 10; j++){
          int sum = i + j;
          if (sum % 10 < target){
            if (i == a || i == b || j == a || j == b){
              count += 2;
            }
            else {
              count += 4;
            }
          }
        }
      }
      float result = (float) count / total_sum;
      System.out.printf("%.3f",result);
    }
  }
}
