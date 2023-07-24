import java.util.Scanner;

public class Fibonacci{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int first=0,second=1,third=0;
    System.out.println(first);      
    while(first<=n){ 



        
      third=second; 
      second=first;
      first=second+third;
      if(first<=n)
      System.out.println(first);
    }
}
}











/* 
first=0,second=1,third=0;
print(first)
for i in range (n):    // i=0  | i=1  | 
    third=second;      // third=1 | third=0
      second=first;      // second=0 | second=1
      first=second+third; // first=0+1  | first=1
      System.out.println(first); // res: 0 1 | res: 0 1 1


*/




// 