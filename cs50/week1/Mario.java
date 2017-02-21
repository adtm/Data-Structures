package com.week1;

import java.util.Scanner;

public class Mario {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int towerHeight;
    do{
       towerHeight = input.nextInt();
       System.out.println("Please Input Again");
    } while(towerHeight > 23 || towerHeight < 0);
    drawTower(towerHeight);
  }

  private static void drawTower(int towerHeight){
    for (int i = 1; i <= towerHeight; i++) {
      String outputRow = "";
      for(int j = towerHeight; j > 0; j--){
        if( j > i) outputRow += " ";
        else outputRow += "#";
      }
      String finalOutput = outputRow + "  " + new StringBuilder(outputRow).reverse().toString() ;
      System.out.println(finalOutput);
    }
  }

}
