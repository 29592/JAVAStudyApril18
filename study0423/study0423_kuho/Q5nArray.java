package study0423_kuho;

import java.util.ArrayList;

/*n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.

정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.

ex) -1 -2 5 -3 -2 7 8 6
    -> -1 -2 -3 -2 5 7 8 6*/

import java.util.Scanner;

public class Q5nArray {
	public static ArrayList<ArrayList> sortA(int n) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[n+1];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> arrP = new ArrayList<Integer>();
		ArrayList<Integer> arrN = new ArrayList<Integer>();
		
		for(int i = 0;i<n;i++) {
			if(arr[i]>0) {
				arrP.add(arr[i]);
			}else {
				arrN.add(arr[i]);
			}
		}
		ArrayList<ArrayList> all = new ArrayList<ArrayList>();
		all.add(arrN);
		all.add(arrP);
		
		
		return all;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList> answer =sortA(n);
		System.out.println(answer);
		sc.close();
	}
}