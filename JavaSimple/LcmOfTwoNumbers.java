import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        boolean flag=true;
        int max=Math.max(n1,n2);
        while(flag){
            if(max%n1==0 && max%n2==0){
                flag=false;
            }
            else    
                max++;
        }
        System.out.println(max);
    }
    
}
