import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int openParanthesis=0;
        int closeParanthesis=0;
        int openBracket=0;
        int closedBracket=0;
        int openSquare=0;
        int closeSquare=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'){
                openParanthesis++;
            }
            else if(str.charAt(i)=='}'){
                closeParanthesis++;
            }
            else if(str.charAt(i)=='('){
                openBracket++;
            }
            else if(str.charAt(i)==')'){
                closedBracket++;
            }
            else if(str.charAt(i)=='['){
                openSquare++;
            }
            else if(str.charAt(i)==']'){
                closeSquare++;
            }
        }
        
if((openBracket==closedBracket) && (openParanthesis==closeParanthesis) && (openSquare==closeSquare)){
        System.out.println(true);
}
else
    System.out.println(false);
        
    }
}
