import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.time.LocalDate;
public class DayBydate {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
       Date date=sdf.parse(str);
       DateFormat df=new SimpleDateFormat("EEEE");
       String day=df.format(date);
       System.out.println(day.toString());
        // LocalDate l=LocalDate.of(arr[2],month[arr[1]],arr[0]);
        // java.time.DayOfWeek dayOfWeek=l.getDayOfWeek();
        // System.out.println(dayOfWeek.toString());
    }
}
