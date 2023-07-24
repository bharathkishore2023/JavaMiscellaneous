import java.util.*;
class VowelOrConsonant{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value: "); //arr={1,2,9};
        String str=sc.nextLine();
        String [] arr=str.split(",+");
        int val=0;
        for(int i=0;i<arr.length;i++){
            int temp=Integer.parseInt(arr[i]);
            val=val*10+temp;
        }
        val+=1;
        String res="";
        String ans=Integer.toString(val);
        for(int i=0;i<ans.length();i++){
            if(i!=ans.length()-1){
            res+=ans.charAt(i);
            res+=",";
            }
           else res+=ans.charAt(i);
           
        }
         System.out.println(res);
    }
}