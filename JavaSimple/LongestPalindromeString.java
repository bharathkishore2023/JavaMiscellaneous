import java.util.*;

public class LongestPalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String>palindromes=new ArrayList<>();
        for(int i=0;i<str.length()-1;i++){
           for(int j=str.length()-1;j>i;j--){
            String temp=str.substring(i, j+1);
            if(checkPalindrome(temp)){
                palindromes.add(temp);
            }
           }
            
        }
        int max=palindromes.get(0).length();
        String res=palindromes.get(0);
        for(int i=1;i<palindromes.size();i++){
            int currentMax=palindromes.get(i).length();
            if(max<currentMax){
                max=currentMax;
                res=palindromes.get(i);
            }
        }
        System.out.println(res);
    }
    public static boolean checkPalindrome(String str){
        int j=str.length()-1;
        boolean res=true;
        int i=0;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                    i++;
                    j--;
            }
            else{
                res=false;
                break;
            }
        }
        return res;
    }
}
