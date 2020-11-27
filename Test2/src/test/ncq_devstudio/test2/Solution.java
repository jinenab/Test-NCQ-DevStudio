package test.ncq_devstudio.test2;
class Solution {
    public int[] solution(int[] A, int[] B) {
        int max = A[0];
        int L = A.length;
        int[] results = new int[L];


        for (int i = 1; i < L; i++) {
        	if(max<A[i])
            max = A[i];
        }        
        
        int[] numberOfWays  = new int[max+1]; 
        
        numberOfWays [0] =1;//one way to climb 0
        numberOfWays [1] =1;//one way to climb 1
        
        
        
        
        //I detected this formula with reccurence
        for(int i=2; i<= max; i++){
            numberOfWays [i] = (numberOfWays [i-1] + numberOfWays [i-2]) ;
            //System.out.println(numberOfWays[i]);
           
        }
   
        for(int i=0; i<L; i++){
            results[i] = (int) (numberOfWays [A[i]] % ( Math.pow(2, B[i]) ));
        }
        
        return results;
    }
}