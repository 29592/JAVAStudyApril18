package testA;

import java.util.Scanner;

public class coding_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		String palen = sc.next();

		int p_length = palen.length();

		int success = 0;
		
		if(p_length % 2 == 0) {
			// 짝수개이면 2로 나눈 나머지의 양 여ㅠ으로 나눔!
			
			for(int i = 0; i< p_length/2 ; i++) {
				
				char single_p = palen.charAt(i);
				
				if(single_p != palen.charAt(p_length-i-1)) {
				
					success = 0;
					
				}else {
					success = 1;
				}
			}
			
		}else {
			//홀수 이면  한개 더 올려서 검색한
			for(int i = 0; i< p_length/2 + 1 ; i++) {
				
				char single_p = palen.charAt(i);
				
				if(single_p != palen.charAt(p_length-i-1)) {
				
					success = 0;
					
				}else {
					success = 1;
				}
			}
		}
		
		System.out.println(success);
		

	}

}