import java.util.Scanner;

public class KangarooMove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int val1=sc.nextInt();
        int s2=sc.nextInt();
        int val2=sc.nextInt();
        boolean flag=true;
        while(flag && s1<=10000 && s2<=10000){
            s1+=val1;
            s2+=val2;
            if(s1==s2){
                System.out.println("s1"+s1);
                System.out.println("s2"+s2);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.print("No");
        }
        else
        System.out.println("Yes");
    }
}
