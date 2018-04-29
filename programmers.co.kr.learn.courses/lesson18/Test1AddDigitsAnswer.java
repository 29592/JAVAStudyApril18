package lesson18;
import java.util.*;

public class Test1AddDigitsAnswer {
	public static int solution(int n) {
		int answer = 0;
		while(n>0) {
			answer+=n%10;
			n/=10;
		}
		return answer;
	}

	public Test1AddDigitsAnswer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(123));
		System.out.println("end");
	}

}
