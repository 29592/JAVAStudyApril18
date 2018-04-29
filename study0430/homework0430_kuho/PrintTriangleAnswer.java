package homework0430_kuho;

public class PrintTriangleAnswer {

	public String PrintTriangleAnswer(int num){
		String result = "";
		String stars = "*";
		for(int i=0; i<num; ++i){
			result += stars+"\n";
			stars += "*";
		}
		return result;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangleAnswer pt = new PrintTriangleAnswer();
		System.out.println( pt.PrintTriangleAnswer(3) );
	}
}


