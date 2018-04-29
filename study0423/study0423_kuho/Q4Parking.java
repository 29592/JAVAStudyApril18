package study0423_kuho;
//https://www.acmicpc.net/problem/2979
/*상근이는 트럭을 총 세 대 가지고 있다. 오늘은 트럭을 주차하는데 비용이 얼마나 필요한지 알아보려고 한다.
상근이가 이용하는 주차장은 주차하는 트럭의 수에 따라서 주차 요금을 할인해 준다.
트럭을 한 대 주차할 때는 1분에 한 대당 A원을 내야 한다. 두 대를 주차할 때는 1분에 한 대당 B원, 세 대를 주차할 때는 1분에 한 대당 C원을 내야 한다.
A, B, C가 주어지고, 상근이의 트럭이 주차장에 주차된 시간이 주어졌을 때, 주차 요금으로 얼마를 내야하는지 구하는 프로그램을 작성하시오.*/
import java.util.Scanner;

public class Q4Parking {

	public static void main(String[] args) {//시간 리스트에 각 시간에 주차된 차량수를 저장한후 계산
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
		
		for(int i =aIN;i <aOut;i++) {//시작시간부터 종료시간사이에 트럭이들어와있으면 차량 수를 ++한다
			arr[i]++;
		}
		for(int i =bIN;i <bOut;i++) {
			arr[i]++;
		}
		for(int i =cIN;i <cOut;i++) {
			arr[i]++;
		}
		for(int i = 0 ; i <101; i++) {
//			System.out.println("i : "+i +", arr : "+arr[i]+"="+answer);
//			answer+=arr[i]==1?A:arr[i]==2?B*2:arr[i]==2?C*3:0;
			if(arr[i]==1) {
				answer+=1;
			}else if(arr[i]==2) {
				answer+=2*B;
			}else if(arr[i]==3){
				answer+=3*C;
			}
		}
		
		
		
		System.out.println(answer);
		sc.close();
	}
}