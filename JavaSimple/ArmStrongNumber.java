import java.util.*;
public class ArmStrongNumber{
    public static int fact(int n){
        int mul=1;
        for(int i=1;i<=n;i++){
            mul*=i;
        }
        return mul;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int temp=n;
        // int len=Integer.toString(n).length();
        // int sum=0;
        // while(temp>0){
        //     int rem=temp%10;
        //     sum+=(int)Math.pow(rem,len);
        //     temp/=10;
        // }
        // if(n==sum){
        //     System.out.println("Yes");
        // }
        // else
        // System.out.println("No");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int total=0;
        while(temp>0){
            int rem=temp%10;
            total+=fact(rem);
            temp/=10;
        }
        if(n==total){
            System.out.print("Yes");
        }
        else
        System.out.print("No");
    }
}