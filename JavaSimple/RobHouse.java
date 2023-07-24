import java.util.*;
public class RobHouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.split(" ");
        int arr[]=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
                arr[i]=Integer.parseInt(strArr[i]);
        }
        int dp[][]=new int[arr.length][arr.length];
        int max=0;
        int i=0,j=0;
       while(i<arr.length && j<arr.length){
                j=i+1;
            if(arr[i]+arr[i+2]>max && arr[i]+arr[i+2]>arr[j]){
                max=arr[i]+arr[i+2];
                i+=2;
            }
            if(arr[i]+arr[i+2]<arr[j]){
                i=j;
            }
       }
       System.out.print(max);
    }
}
