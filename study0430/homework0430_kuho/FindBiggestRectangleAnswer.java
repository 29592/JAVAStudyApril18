package homework0430_kuho;

import java.util.ArrayList;
import java.util.Arrays;

public class FindBiggestRectangleAnswer {
	public static int solution(int [][]board){
		int answer= 0;
		int dp[][] = new int[1001][1001];
		for(int i=1;i<=board.length;++i) {
			for(int j=1;j<=board[0].length;++j) {
				if(board[i-1][j-1]!=0) {
					dp[i][j]=Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]))+1;
					answer=Math.max(answer,dp[i][j]);
				}
			}				
		}		
		return answer*answer;
	}
	
	public static void main(String[] args) {
		int arr[][] = {{0,1,1,1,0},{1,1,1,1,0},{1,1,1,1,0},{0,0,1,0,0}};
		System.out.println(solution(arr) ); 
	}
}