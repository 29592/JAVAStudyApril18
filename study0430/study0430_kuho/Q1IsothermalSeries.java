package study0430_kuho;

import java.util.Scanner;
//https://www.acmicpc.net/problem/1065
public class Q1IsothermalSeries {

	public Q1IsothermalSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//		int a = 223;
		int answer = 1;
		int count = 0;
		for(int i = a;i>=1;i--) {
			char[] chars = (""+i).toCharArray();
			int len = chars.length;
			if(len == 4) {}
			else if(len==3) {
				//				System.out.println(chars);
				if(chars[0]-chars[1]==chars[1]-chars[2]) {
//					System.out.println(i);
					count++;
				}
			}else {
				//				System.out.println("_____");
//				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}

}
