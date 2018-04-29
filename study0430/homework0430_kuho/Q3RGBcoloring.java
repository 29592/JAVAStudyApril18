package homework0430_kuho;
import java.util.ArrayList;
////https://www.acmicpc.net/problem/1149
///*RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
// * 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 
// * 집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.
//각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 
//모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.*/
import java.util.Scanner;
//
public class Q3RGBcoloring {
	public static void main(String[] args) {//N가지 경우의 수를 탐색한 후 조건에 맞지않는것을 제외하는 경우	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int priceEach[][] =new int[N+1][3];
		for(int i=1;i<N+1;i++) {
			for(int j =0;j<3;j++) {
				priceEach[i][j]=sc.nextInt();
		}}
		int[][] dp = new int[N+1][3];
		dp[0][0]=0;
		dp[0][1]=0;
		dp[0][2]=0;
		for(int i=1;i<N+1;i++) {
			dp[i][0]=Math.min(dp[i-1][1], dp[i-1][2])+priceEach[i][0];
			dp[i][1]=Math.min(dp[i-1][0], dp[i-1][2])+priceEach[i][1];
			dp[i][2]=Math.min(dp[i-1][0], dp[i-1][1])+priceEach[i][2];
		}
		System.out.println(Math.min(dp[N][0],Math.min(dp[N][1],dp[N][2])));
		
		sc.close();
	}
}