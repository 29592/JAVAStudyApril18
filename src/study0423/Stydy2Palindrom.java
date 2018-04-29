package study0423;
//https://www.acmicpc.net/problem/10988
/*알파벳 소문자로만 이루어진 단어가 주어진다. 이 때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Stydy2Palindrom {

	public static void main(String[] args) {//재귀함수(for)
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int answer =0;//초기화
		char arr[] =str.toCharArray();//String을CharacterArray로 변환시키는 함수.
		int n = arr.length;
		for(int i = 0; i <n/2+1; i++) {
			if(arr[i]!=arr[n-1-i]) {//조건을 어길시에만 1을 반납한다.
//				System.out.print(arr[i]);
				answer = 1;
			}			
		}
		System.out.println(answer);
		sc.close();
	}

}