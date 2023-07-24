import java.util.*;
public class NumberOfHandShakes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.println(n-(n/2));
    }
}


    // public static  int numberOfHandShake(int n){
    //     if (n == 0)
    //     return 0;
    // else
    //     return (n - 1) +numberOfHandShake(n - 1);
    // }