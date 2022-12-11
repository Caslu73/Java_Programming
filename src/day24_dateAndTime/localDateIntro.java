package day24_dateAndTime;

import java.time.LocalDate;

public class localDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();//Local date of now, this object is unmutable

        System.out.println(today);

        LocalDate birthday = LocalDate.of(2000,5,25);//another date that you want specify

        System.out.println(birthday);

        System.out.println("--------------------------------------------------");

        System.out.println(today.getYear());//today get year

        System.out.println(today.getMonth()); // today get month

        System.out.println(today.getMonthValue()); // number of the month

        System.out.println(today.getDayOfWeek());// day of the week, actual day

        System.out.println(birthday.getDayOfWeek());//get the day of born of this peron

        System.out.println(today.getDayOfWeek()); //

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("---------------------------------------------------------------");

      today =  today.plusYears(1); //2023, I have to assign in order to update the year

        System.out.println(today);

        System.out.println("-----------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate = graduationDate.plusYears(2); //2027-6-4

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);//adding 7 months

        System.out.println(graduationDate);

        //if the grad delay 7 weeks more
        graduationDate = graduationDate.plusWeeks(7);//

        System.out.println(graduationDate);
        //if the grad delay 100 days
        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("--------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(2005,4,1);

        //his brother birthday
      LocalDate yourBrotherBirthDay =  yourBirthday.minusYears(2).minusMonths(3);


        System.out.println(yourBirthday);
        System.out.println(yourBrotherBirthDay);

        System.out.println("---------------------------");


        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1);

        System.out.println("-------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31) ));
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31) ));

        System.out.println("---------------------------------------");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear());







    }
}
