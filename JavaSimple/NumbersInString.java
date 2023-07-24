import java.util.*;
import java.io.*;
public class NumbersInString{
    public static void main(String []args)throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String str=br.readLine();
        String arr[]=str.split(" +");
        ArrayList<String>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i].charAt(0))){
                    res.add(arr[i]);
            }
        }
        int max=res.get(0).length();
        for(int i=1;i<res.size();i++){
            max=Math.max(max,res.get(i).length());
        }
        System.out.print(res.get(max));
    }
}