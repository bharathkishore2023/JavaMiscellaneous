import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int len=str1.length();
        int min=len-1;
        for(int i=0;i<str2.length()-1;i++){
            for(int j=i+1;j<str2.length();j++){
                    String temp=str2.substring(i,j+1);
                    StringBuffer bf=new StringBuffer(temp);
                    String temp1=bf.reverse().toString();
                    if(str1.contains(temp) ||str1.contains(temp1)){
                       min= Math.min(min,len-temp.length());
                      // System.out.println("temp :"+temp);
                      // System.out.println("min: "+min);
                    }
            }
        }
        System.out.println(min);
    }
}
