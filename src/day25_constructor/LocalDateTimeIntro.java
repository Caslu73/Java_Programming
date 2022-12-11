package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();//Time now, today, actual time
        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0);
        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());//Monday

        System.out.println(starts.getDayOfMonth());//21


    }
}
