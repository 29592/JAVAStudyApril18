	package studyA;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Scanner;

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