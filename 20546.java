//틀린 이유 못찾음
// import java.util.*;

// public class Main{
//   public static void main(String[] args){
//     Scanner scanner = new Scanner(System.in);

//     int money = scanner.nextInt();  

//     int[] arr = new int[14];
    
//     for(int i = 0; i < 14; i++){
//       arr[i] = scanner.nextInt();
//     }


//     int junhyeon_result = BNP(arr,money);
//     int seoungmin_result = TIMING(arr,money);

//     if (junhyeon_result > seoungmin_result){
//       System.out.println("BNP");
//     }
//     else if (junhyeon_result < seoungmin_result){
//       System.out.println("TIMING");
//     }
//     else {
//       System.out.println("SAMESAME");
//     }
//   }
  
//   static int BNP(int arr[], int money){
//     int count = 0;
//     int rest_money = money;
//     for(int i = 0; i < 14; i++){
//       int now = rest_money / arr[i];
//       count += now;
//       rest_money -= now * arr[i];
//     }

//     return rest_money + (count * arr[13]);
//   }

//   static int TIMING(int arr[], int money){
//     int count = 0;
//     int rest_money = money;
//     for(int i = 2; i < 14; i++){
//       if((arr[i] > arr[i-1]) && (arr[i-1] > arr[i-2])){
//         if(count > 0){
//           rest_money += count * arr[i];
//           count = 0 ;
//         }
//       }
//       else if((arr[i] < arr[i-1]) && (arr[i-1] < arr[i-2])){
//         int now = rest_money/arr[i];
//         if (now > 0){
//           count += now;
//           rest_money -= now * arr[i];
//         }
//       }
//     }
//     return rest_money + (count * arr[13]);
//   }
// } 




//맞은 코드
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int money = scanner.nextInt();  

    int[] arr = new int[14];
    
    for(int i = 0; i < 14; i++){
      arr[i] = scanner.nextInt();
    }


    int junhyeon_result = BNP(arr,money);
    int seoungmin_result = TIMING(arr,money);

    if (junhyeon_result > seoungmin_result){
      System.out.println("BNP");
    }
    else if (junhyeon_result < seoungmin_result){
      System.out.println("TIMING");
    }
    else {
      System.out.println("SAMESAME");
    }
  }
  
  static int BNP(int arr[], int money){
    int count = 0;
    int rest_money = money;
    for(int i = 0; i < 14; i++){
      int now = rest_money / arr[i];
      count += now;
      rest_money -= now * arr[i];
    }

    return rest_money + (count * arr[13]);
  }

  static int TIMING(int arr[], int money){
    int count = 0;
    int rest_money = money;
    int upCount = 0;
    int downCount = 0;

    for(int i = 1; i < 14; i++){


      if(arr[i] > arr[i-1]){
        upCount++;
        downCount = 0;
      }
      else if(arr[i] < arr[i-1]){
        downCount++;
        upCount = 0;
      }
      else{
        upCount = 0;
        downCount = 0;
      }

      if(upCount == 3){
        if(count != 0){
          rest_money += arr[i] * count;
        }
        upCount = 0;
        count = 0;
      }
      else if(downCount == 3){
        int now = rest_money / arr[i];
        count += now;
        rest_money -= now * arr[i];
      }

    }
    return rest_money + (count * arr[13]);
  }
} 