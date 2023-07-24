import java.util.*;
class KthSmallest{
    public static int solve(int N,int K,int[] arr){
        Arrays.sort(arr);
        int missing=1;
        for(int i=0;i<N;i++){
            if(arr[i]==missing)
            missing+=1;
            else if(i==K-1)
            return missing;
        }
            return missing +K-1;

    }
    public static void main(String[] args) {
        int[] arr={1,3,6};  
        int N=3;
        int K=2;
        System.out.println(solve(N,K,arr));
        }
}