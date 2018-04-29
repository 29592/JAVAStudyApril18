package study0426_kuho;
//https://www.acmicpc.net/problem/1547
/*세준이는 컵 3개를 탁자위에 일렬로 놓았다. 컵의 번호는 가장 왼쪽 컵부터 순서대로 1번, 2번 3번이고, 세준이는 이 컵을 이용해서 게임을 하려고 한다.

먼저 1번컵의 아래에 공을 하나 넣는다. 세준이는 두 컵을 고른 다음, 그 위치를 바꾸려고 한다. 예를 들어, 고른 컵이 1번과 2번이라면, 1번 컵이 있던 위치에 2번 컵을 이동시키고, 동시에 2번 컵이 있던 위치에 1번 컵을 이동시켜야 한다. 위치를 바꿀 때, 컵을 먼저 들고 이동해야 한다. 따라서, 공의 위치는 가장 처음 1번컵이 있던 위치와 같다.

세준이는 컵의 위치를 총 M번 바꿀 것이며, 컵의 위치를 바꾼 방법이 입력으로 주어진다. 위치를 M번 바꾼 이후에 공이 들어있는 컵의 번호를 구하는 프로그램을 작성하시오.*/
import java.util.Scanner;

public class Q1Yabawi {

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
