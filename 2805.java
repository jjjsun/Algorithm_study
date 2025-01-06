import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt(); //나무 수
    int m = scanner.nextInt(); //가져가려는 나무길이
    int[] tree = new int[n];
    int max = 0;
    for(int i = 0; i < n; i++){
      tree[i] = scanner.nextInt();
      if(tree[i] > max){
        max = tree[i];
      }
    }


    int left = 0; //톱날 최소 높이
    int right = max; //톱날 최대 높이
    int result = 0; //적절한 톱날 높이

    while(left <= right){
      int mid = (left + right) /2;
      long sum = 0;

      for(int height : tree){ //height에 tree의 요소가 하나씩 할당됨
        if(height > mid){
          sum += (height - mid);//tree의 잘라진 윗부분 하나씩 sum에 합치는중
          if(sum >= m){
            break;
          }
        }
      }
      if(sum >= m){
        result = mid;
        left = mid + 1;
      }
      else{
        right = mid -1;
      }
    }
    System.out.println(result);
  }
}
