import java.util.*;
public class DuplicatesNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String elements[]=input.split(" ");
        int[] arr=new int[elements.length];
        int[] result=new int[10];
        boolean flag=true;
        for(int i=0;i<elements.length;i++){
                arr[i]=Integer.parseInt(elements[i]);
        }
        for(int i=0;i<arr.length;i++){
            result[arr[i]]++;
    }
    for(int i=0;i<result.length;i++){
        if(result[i]>1){
        flag=false;
        break;
}
    }
    System.out.println(flag);
    }
}
