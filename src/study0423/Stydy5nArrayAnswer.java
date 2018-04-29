package study0423;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.

정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.

ex) -1 -2 5 -3 -2 7 8 6
    -> -1 -2 -3 -2 5 7 8 6*/
public class Stydy5nArrayAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);

		int n  = sc.nextInt();
		int[] arr  = new int[n];
		ArrayList<Integer> minus = new ArrayList<Integer>();
		ArrayList<Integer> plus = new ArrayList<Integer>();

		ArrayList<ArrayList> all = new ArrayList<ArrayList>();

		for(int i = 0; i <n ; i++) {

			arr[i]= sc.nextInt();

		}

		for(int i = 0 ; i< n ; i++) {

			if(arr[i] < 0) {
				//음수이면 앞으로 옮긴다....
				minus.add(arr[i]);

			}else {
				plus.add(arr[i]);
			}
		}

		all.add(minus);
		all.add(plus);

		System.out.println(all);


	}

}