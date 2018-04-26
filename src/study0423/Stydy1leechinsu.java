package study0423;
//https://www.acmicpc.net/problem/2193
/*0과 1로만 이루어진 수를 이진수라 한다. 이러한 이진수 중 특별한 성질을 갖는 것들이 있는데, 이들을 이친수(pinary number)라 한다. 이친수는 다음의 성질을 만족한다.
이친수는 0으로 시작하지 않는다.
이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
예를 들면 1, 10, 100, 101, 1000, 1001 등이 이친수가 된다. 하지만 0010101이나 101101은 각각 1, 2번 규칙에 위배되므로 이친수가 아니다.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Stydy1leechinsu {

	public static void main(String[] args) {//피보나치 수열
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] arr = new long[N+1];//0~N까지 표시되는 array를 만든다.

		arr[0] = 0;            
		arr[1] = 1;            
//		arr[2] = 1;//new long[1]일경우(N이0일경우) arrayIndexOutOfBounds

		for(int i=3;i<N+1;i++){//array를 피보나치 수열로 채운다.
			arr[i]=arr[i-2]+arr[i-1];
		}
		System.out.println(arr[N]);
	}

}