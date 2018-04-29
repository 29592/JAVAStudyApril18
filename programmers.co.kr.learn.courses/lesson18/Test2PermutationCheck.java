package lesson18;

import java.util.ArrayList;
import java.util.List;

public class Test2PermutationCheck {

	public static boolean solution(int[] arr) {
		boolean answer = true;
		System.out.println(arr.length);
		List<Integer> retarr = new ArrayList<>();
		for(int j =arr.length;j>0;j--) {
			retarr.add(j);
		}
		System.err.println(retarr);

		for(int a:arr) {
			if(retarr.contains(a)) {
				System.out.println(retarr.indexOf(a)+": 인덱스 , a값:"+a);
				retarr.remove(retarr.get(retarr.indexOf(a)));
			}else {
				answer=false;
			}
		}
		return answer;
	}

	public Test2PermutationCheck() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,2,30};
		System.out.println(solution(arr));
		System.out.println("end");
	}

}
