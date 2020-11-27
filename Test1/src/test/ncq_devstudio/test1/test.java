package test.ncq_devstudio.test1;

public class test {

	public static void main(String[] args) {
		int[] A = new int[] { 3, 4, 4, 6, 1, 4, 4, };
		int[] counters = new Solution().solution(5, A);
		int N = 5;
		
		System.out.println("Final Result");
		for (int i = 0; i < N; i++) {
			System.out.print(counters[i] + " ");

		}

	}

}
