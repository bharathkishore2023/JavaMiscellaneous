import java.util.*;
public class Pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
        }
    }
}
/*







Print the following pattern :
input = 5

output :

1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1

 */