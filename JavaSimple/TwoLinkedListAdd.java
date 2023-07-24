import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class TwoLinkedListAdd {
    public static int[] swapValues(int[] arr){
        int j=arr.length-1;
       int  i=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strFirst=sc.nextLine();
        String strSecond=sc.nextLine();
        if(strFirst.length()<strSecond.length()){
           StringBuffer bf=new StringBuffer(strFirst);
           strFirst=bf.reverse().toString();
        }
        if(strFirst.length()>strSecond.length()){
            StringBuffer bf=new StringBuffer(strSecond);
            strSecond=bf.reverse().toString();
         }
        String arr[]=strFirst.split(" ");
        String arr2[]=strSecond.split(" ");
        int max=Math.max(arr.length,arr2.length);
        int num1[]=new int[max];
        int num2[]=new int[max];
        int count1=0;
        int count2=0;
        for(int i=0;i<max;i++){
            if(i<arr.length){
            num1[i]=Integer.parseInt(arr[i]);
            }
            else if(count1==0){
                num1=swapValues(num1);
                count1++;
            }
            if(i<arr2.length)
            num2[i]=Integer.parseInt(arr2[i]);
            else if(count2==0){
                num2=swapValues(num2);
                count2++;
            }
        }
        String res="";
        int carry=0;
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        for(int i=max-1;i>=0;i-- ){
            int sum=num1[i]+num2[i]+carry;
            carry=0;
            int rem=0;
            if(sum>9){
                 rem=sum%10;
                 res+=rem;
                 carry=sum/10;                 
            }
            else{
                res+=sum;
            }
             if((i==0) && (carry>0)){
                res+=carry;
            }
            
        }
        StringBuffer br=new StringBuffer(res);
        System.out.println(br.reverse().toString());
    }
}
