package test.ncq_devstudio.test1;

class Solution {
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		for (int i = 0; i < N; i++) {
			counters[i] = 0;
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				counters[A[i] - 1]++;
			} else {
				if (A[i] == N + 1) {
					for (int j = 0; j < counters.length; j++)
						counters[j] = max(counters);
				}

			}
			//the values of the counters after each consecutive operation
			for (int k = 0; k < N; k++) {
				System.out.print(counters[k] + " ");
			}
			System.out.println();
		}

		return counters;
	}

	private int max(int[] tab) {
		int max = tab[0];

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}



}
