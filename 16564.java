import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
    }
    Arrays.sort(arr);

    int left = arr[0];
    int right = arr[n-1] + k;
    int result = 0;

    while(left <= right){
      int mid = (left+right)/2;
      long sum = 0;
      for(int i = 0; i < n; i++){
        if(arr[i] < mid){
          sum += (mid-arr[i]);
        }
      }
      if(sum <= k){
        result = mid;
        left = mid+1;
      }
      else{
        right = mid-1;
      }
    }
    System.out.println(result);
    
  }
} 


