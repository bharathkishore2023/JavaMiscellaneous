import java.util.*;
class GoldSharing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int goldCoins=sc.nextInt();
        int bensDiscount=sc.nextInt();
        int blacksDiscount=sc.nextInt();
        sc.close();
        int bensShare=(goldCoins*bensDiscount)/100;
        int remainingGold=goldCoins-bensShare;
        int blacksShare=(remainingGold*blacksDiscount)/100;
        remainingGold-=blacksShare;
        int otherShare=remainingGold/3;
       System.out.println("bensShare:"+bensShare);
       System.out.println("blackShare:"+blacksShare);
       System.out.println("otherShare:"+otherShare);
    }
}

