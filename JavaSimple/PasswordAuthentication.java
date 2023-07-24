import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PasswordAuthentication{
    public static ArrayList<String> checkStatus(ArrayList<String> codes,int limit){
        HashMap<String,Integer>codeData=new HashMap<>();
        ArrayList<String>result=new ArrayList<>();
        for(int i=0;i<codes.size();i++){
            if(!codeData.containsKey(codes.get(i))){
                codeData.put(codes.get(i),1);
                result.add("ACCEPT");
            }
            
            else if(codeData.containsKey(codes.get(i)) && codeData.get(codes.get(i))<limit){
                int value=codeData.get(codes.get(i));
                System.out.println("value: "+value);
                codeData.put(codes.get(i),value++);
                result.add("ACCEPT");
            }
            else{
                result.add("REJECT");
            }
        }
        return result;

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of codes");
    int n=sc.nextInt();
    ArrayList<String>codes=new ArrayList<>();
    for(int i=0;i<n;i++){
        System.out.println("enter code :"+i);
        String str=sc.next();
        codes.add(str);
    }
    sc.next();
    System.out.println("enter the limit: ");
    int limit=sc.nextInt();
    System.out.println(checkStatus(codes,limit));
}
}