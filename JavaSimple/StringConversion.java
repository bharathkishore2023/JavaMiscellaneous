import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String num="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                num+=str.charAt(i);
            }
        }
        int min=Integer.parseInt(num);
        for(int i=1;i<num.length();i++){
            int temp=0;
            String s1=""+num.charAt(0);
           for(int j=1;j<num.length();j++){
                    if(i==j){
                        int val=9-Integer.parseInt(""+str.charAt(j));
                        s1+=val;
                    }
                    else if(i!=j) s1+=num.charAt(j);
           }
           int v1=Integer.parseInt(s1);
           if(v1<min) {
            min=v1;
            num=s1;
           }
        }
        System.out.print(min);
    }



    
}
