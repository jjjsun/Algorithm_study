import java.util.*;

public class Main{

  static int[][] bingo;
  static int count;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    bingo = new int[5][5];
    count = 0;


    //빙고판 입력받기
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        bingo[i][j] = scanner.nextInt();
      }
    }

    //사회자가 부른 수 0으로 바꾸기
    for(int z = 0; z < 25; z++){
      int num = scanner.nextInt();
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
          if(bingo[i][j] == num){
            bingo[i][j] = 0;
          }
        }
      }
      //빙고 체크
      count = 0;
      colCheck();
      rowCheck();
      lCheck();
      rCheck();
      
      if(count >= 3){
        System.out.println(z+1);
        break;
      }

      
    }

  }
  public static void rowCheck(){
    for(int i = 0; i < 5; i++){
      int zeroCount = 0;
      for(int j = 0; j < 5; j++){
        if(bingo[i][j] == 0){
          zeroCount++;
        }
      }
      if(zeroCount == 5){
        count++;
      }
    }
  }
  public static void colCheck(){
    for(int j = 0; j < 5; j++){
      int zeroCount = 0;
      for(int i = 0; i < 5; i++){
        if(bingo[i][j] == 0){
          zeroCount++;
        }
      }
      if(zeroCount == 5){
        count++;
      }
    }
  }
  public static void lCheck(){
    int zeroCount = 0;
    for(int i = 0; i < 5; i++){
      if(bingo[i][i] == 0){
        zeroCount++;
      }
    }
    if(zeroCount == 5){
      count++;
    }

  }
  public static void rCheck(){
    int zeroCount = 0;
    for(int i = 0; i < 5; i++){
      if(bingo[i][4-i] == 0){
        zeroCount++;
      }
    }
    if(zeroCount == 5){
      count++;
    }
  }
}