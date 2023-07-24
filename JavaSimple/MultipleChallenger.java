import java.util.*;



public class MultipleChallenger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        int f1=0,f2=0;
        int sum1=0,sum2=0;
        for(int i=start;i<=end;i++){
               if(i%n1==0){
                f1++;
                sum1+=i;
               }
               if(i%n2==0){
                f2++;
                sum2+=i;
               }
            }
               System.out.print(f1+" ");
                System.out.print(f2+" ");
                System.out.print(sum1+" ");
                 System.out.print(sum2+" ");
        }
    }
}