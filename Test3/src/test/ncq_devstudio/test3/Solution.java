package test.ncq_devstudio.test3;

class Solution {
	public int solution(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		int s = 0;
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			int value = Math.abs(A[i]);
			s += value;// Maximum possible sum 
			A[i] = value;
			if (max < value) {
				max = value;
			}
		}
		int result = s;

		int[] counts = new int[max + 1];
		for (int i = 0; i < A.length; i++) {
			counts[A[i]]++;
			//count occ of abs(A[i])
		}
		int[] r = new int[s + 1];
		for (int i = 1; i < r.length; i++) {
			r[i] = -1;
		}

		for (int i = 1; i < counts.length; i++) {
			for (int j = 0; j < r.length; j++) {
				if (r[j] >= 0) {
					r[j] = counts[i];
				} else if (j  >= i && r[j - i] > 0) {
					r[j] = r[j - i] - 1;
				}
			}
		}

		for (int i = 0; i < r.length / 2 + 1; i++) {
			if (r[i] >= 0 && result > Math.abs(s - 2 * i)) {
				result = Math.abs(s - 2 * i);
			}
		}
		return result;
	}
}