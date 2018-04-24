package studyA;

import java.util.Scanner;

public class Stydy4Parking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int aIN = sc.nextInt();
		int aOut = sc.nextInt();
		int bIN = sc.nextInt();
		int bOut = sc.nextInt();
		int cIN = sc.nextInt();
		int cOut = sc.nextInt();
		
		int answer =0;
		int arr[]= new int[101];
		
		for(int i =aIN;i <aOut;i++) {
			arr[i]++;
		}
		for(int i =bIN;i <bOut;i++) {
			arr[i]++;
		}
		for(int i =cIN;i <cOut;i++) {
			arr[i]++;
		}
		
		for(int i = 0 ; i <101; i++) {
			answer+=arr[i]==1?A:arr[i]==2?B*2:C;
		}
		
		
		
		System.out.println(answer);
		sc.close();
	}
}