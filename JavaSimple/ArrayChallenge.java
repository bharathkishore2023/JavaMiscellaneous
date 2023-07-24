class ArrayChallenge{
    public static void main(String[] args) {
        String str1="5 2 3";
        String str2="2 2 2 3 10 6";
        String strArr[]={"5 2 3","2 2 2 3 10 6"};
        System.out.println(ArrayChallenge.arrayChallenge(strArr));
    }
    public static String arrayChallenge(String[] strArr){
        int min=100;
        String res="";
        String str1[]=strArr[0].split(" +");
        String str2[]=strArr[1].split(" +");
        int arr1[]=new int[str1.length];
        int arr2[]=new int[str2.length];
        for(int i=0;i<str1.length;i++){
           arr1[i]=Integer.parseInt(str1[i]);
        }
        for(int i=0;i<str2.length;i++){
            arr2[i]=Integer.parseInt(str2[i]);
         }
         int minArr[]={};
        if(arr1.length>arr2.length){
            min=arr2.length;
            minArr=arr2;
        }
        else {
            min=arr1.length;
            minArr=arr2;
        }
        for(int i=0;i<min;i++){
            res+=arr1[i]+arr2[i];
            res+="-";
        }
        for(int i=min;i<minArr.length;i++){
            res+=minArr[i];
            res+="-";
            
        }
        return res;
    }
}