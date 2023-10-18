package org.example.thread.p01thread.lambda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String postion = "1";
        int move;
        Scanner in = new Scanner(System.in);
        while (true) {
          move = in.nextInt();
          if(move >= 1 && move <=100){
              break;
          }
        }
        in.nextLine();
        String[][] array = new String[move][2];
        for (int i = 0; i < move; i++) {
          String[] a = in.nextLine().split(" ");
          if (a[0].equals(a[1])){
              i--;
              continue;
          }
          array[i] = a;
        }
        for (int i = 0; i < move; i++) {
            if(array[i][0].equals(postion)) {
                postion=array[i][1];
            } else if (array[i][1].equals(postion)) {
                postion=array[i][0];
            }

        }
        System.out.println(postion);

    }
}
