package studyA;

import java.util.ArrayList;
import java.util.Scanner;

public class Stydy2palendrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int answer =0;
		char arr[] =str.toCharArray();
		int n = arr.length;
		for(int i = 0; i <n/2+1; i++) {
			if(arr[i]!=arr[n-1-i]) {
//				System.out.println(arr[i]);
				answer = 1;
			}			
		}
		System.out.println(answer);
		sc.close();
	}

}