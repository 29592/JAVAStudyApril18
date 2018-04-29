package testA;

import java.util.Arrays;

import java.util.Scanner;

public class Solution {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int M = sc.nextInt();
      int X = 0;
      int Y = 0;
      int[] ball = {1, 2, 3};
      
      for(int i = 0; i < M ; i++) {
         X = sc.nextInt();
         Y = sc.nextInt();
         
         int tmp = ball[Y-1];
         ball[Y-1] = ball[X-1];
         ball[X-1] = tmp;
         System.out.print(ball[0]);
         System.out.print(ball[1]);
         System.out.println(ball[2]);
      }
      for(int i = 0;i<4;i++) {
			if(ball[i]==1)	{System.out.println(++i);}
		}
      
   }

}