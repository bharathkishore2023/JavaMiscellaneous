import java.util.*;
class NumberOfOccurences{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-97]++;
        }
        System.out.print(arr[ch-97]);
    }
}
