import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);


    int num = scanner.nextInt();


    int arr[] = {1, 0, 0};

    for(int j = 0; j < num; j++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (arr[x-1] != arr[y-1]){
        int temp = arr[y-1];
        arr[y-1] = arr[x-1];
        arr[x-1] = temp;
      }
    }
    for(int i = 0 ; i < 3; i++){
      if(arr[i] == 1){
        System.out.println(i+1);
      }
    }
  }
}