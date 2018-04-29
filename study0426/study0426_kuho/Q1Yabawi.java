package study0426;

import java.util.Scanner;

public class Study1Yabawi {

	static int arr[] = {0,1,0,0};

	public static void swap(int a,int b) {
		int tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}

	public static void main(String[] args) {//야바위
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0 ; i <N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			swap(a,b);
		}
		for(int i = 0;i<4;i++) {
			if(arr[i]==1)	{System.out.println(i);}
		}
		
	}

}
