import java.util.Arrays;

public class ValidPairs {

    public static long solve(int Q,int[][]pairs,int N,int[]A){
        long count=0;
            for(int i=0;i<N;i++){
                for(int j=i+1;j<N;j++){
                    int temp[][]={{A[i],A[j]}};
                    for(int k=0;k<Q;k++){
                       if(temp[0][0]==pairs[k][0] && temp[0][1]==pairs[k][1])
                       count+=1;
                        }
                    }
                }
            
            return count;
            }
    
            3

            
    public static void main(String[] args) {
        int N=7;
        int Q=3;
        int[][] pairs={{4,10},{10,5},{5,4}};
        int A[]={4,4,10,5,4,10,5};
        System.out.print(solve(Q,pairs,N,A));
    }
}
