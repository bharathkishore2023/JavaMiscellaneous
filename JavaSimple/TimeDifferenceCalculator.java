import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class TimeDifferenceCalculator {
    public static void main(String[] args)throws Exception {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.print("enter the first time: ");
        String first=br.readLine();
        System.out.print("enter the second time: ");
        String second=br.readLine();
        String[] timeOne=first.split(":");
        String [] timeTwo=second.split(":");
        int arr1[]=new int[timeOne.length];
        int []arr2=new int[timeOne.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=Integer.parseInt(timeOne[i]);
            arr2[i]=Integer.parseInt(timeTwo[i]);
        }
        // swap if hour-1 is smaller 
        if(arr1[0]<arr2[0]){
            int[] temp=arr1;
            arr1=arr2;
            arr2=temp;
        }
        else if(arr1[1]<arr2[1]){
            int[] temp=arr1;
            arr1=arr2;
            arr2=temp;
        }
        else if(arr1[2]<arr2[2]){
            int[] temp=arr1;
            arr1=arr2;
            arr2=temp;
        }
        int[] result=new int[arr1.length];
        for(int i=arr1.length-1;i>=0;i--){
            if(arr1[i]<arr2[i]){
                arr1[i]=60+arr1[i];
                arr1[i-1]=arr1[i-1]-1;
            }
            result[i]=arr1[i]-arr2[i];
        }
        for(int i=0;i<result.length;i++){
            if(i!=result.length-1)
            System.out.print(result[i]+":");
            else
            System.out.print(result[i]);
        }
    }
}
