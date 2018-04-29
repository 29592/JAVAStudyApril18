package lesson18;

public class Test1AddDigits {
	public static int solution(int n) {
		int answer = 0;

		char[] chars = ("" +n).toCharArray();
//		System.out.println(chars);
		for(char c:chars) {
			answer+=(int)c-(int)'0';
//			Character.getNumericValue(c);
//			System.out.println(answer+"cc"+c);
		}
		return answer;
	}

	public Test1AddDigits() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(123));
		System.out.println("end");
	}

}
