package test.ncq_devstudio.test2;

public class test {

	public static void main(String[] args) {
		int[] A = new int[] {  4, 4, 5, 5, 1 };
		int[] B = new int[] { 3, 2,4,3,1 };
		
		int [] results=new Solution().solution(A, B);

		
		for(int i=0;i<A.length;i++) {
			System.out.print(results[i]+"");
		}
			
	

	}
}
