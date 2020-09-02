package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String format = now.format(DateTimeFormatter.ISO_DATE).replace("-","");
        System.out.println(format);
    }
}
