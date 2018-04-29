package homework0430_kuho;

import java.util.ArrayList;
import java.util.Arrays;

public class FindBiggestRectangle {

	public static int check(int [][]board,int i ,int j) {
		int answer=0;
		if(board[i][j]==1) {
			if(board[i+1][j]==1&&board[i][j+1]==1&&board[i+1][j+1]==1) {
				return Math.min(Math.min(check(board,i+1,j)+1,check(board,i,j+1))+1,check(board,i+1,j+1));
			}
			else {answer=1;}
		}
		else {}
		
		return answer;
	}
	public static int solution(int [][]board)
	{
		int answer= 0;
ArrayList<Integer> name = new ArrayList<>();
name.add(1);

int n =board.length;
		int m =board[0].length;
		
		
		for(int i = 0;i<n-1;i++) {
			for(int j = 0;j<m-1;j++) {
				System.out.println("i"+i+"j"+j+"check"+check(board,i,j));
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int arr[][] = {{0,1,1,1,0},{1,1,1,1,0},{1,1,1,1,0},{0,0,1,0,0}};
		System.out.println(solution(arr) );
		
	}
}