import java.util.*;
public class FindBot {

    public static boolean checkprime(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int alpha[]=new int[26];
           arr[i]= arr[i].toLowerCase();
            for(int j=0;j<arr[i].length();j+=2){
                int c=(int)arr[i].charAt(j)-97;
                if(alpha[c]==0){
                    res[i]++;
                    alpha[c]++;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        for(int i=0;i<res.length;i++){
            if(checkprime(res[i])){
                System.out.print(1+" ");
            }
            else
            System.out.print(0+" ");
        }
    }
}
