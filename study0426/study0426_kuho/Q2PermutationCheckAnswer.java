package study0426_kuho;

public class Q2PermutationCheckAnswer {


	public static boolean solution(int[] arr) {

		boolean answer = true;

		boolean[] check = new boolean[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= arr.length && !check[arr[i]]) {

				check[arr[i]] = true;

			} else {
				answer = false;
				break;
			}
		}
		for(boolean a :check) {
			System.out.println("a:"+a);
		}
		return answer;
	}



	public Q2PermutationCheckAnswer() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,2,1};
		System.out.println(solution(arr));
		System.out.println("end");
	}

}
