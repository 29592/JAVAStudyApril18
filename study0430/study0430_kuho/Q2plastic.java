package study0430_kuho;
//https://www.acmicpc.net/problem/1475
	import java.util.Scanner;

public class Q2plastic{

	public Q2plastic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roomNum = sc.nextInt();
		double count = 0.5;
		double countElse[] = new double[10];
		char[] chars = (""+roomNum).toCharArray();//--48
		for(char c:chars) {
			if(c+0==54||c+0==57) {
				count+=0.5;
			}else {
				int position = c-48;
//				System.out.println(position);
				countElse[position]++;
			}			
		}
		double answer = countElse[0];
		for(int i = 1; i<10;i++) {
			answer = Math.max(countElse[i],answer);
		}
		System.out.println((int)Math.max(answer, count));
	}

}
