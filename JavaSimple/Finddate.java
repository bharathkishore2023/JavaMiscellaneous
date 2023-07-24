
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Finddate {
    public static LocalDate findYesterday(LocalDate d){
        return new LocalDate(d.now().plusDays(0));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Date d=new Date();
        LocalDate l=LocalDate.now();
       System.out.println(l);
       System.out.println("Yesterday"+findYesterday(d));
       }
}
