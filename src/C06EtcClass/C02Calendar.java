package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Locale;

public class C02Calendar {
    public static void main(String[] args) {
////        java.util패키지의 Calendar 클래스
//        Calendar myCalendar=Calendar.getInstance();
//        System.out.println(myCalendar.getTime());
//        System.out.println(myCalendar.get(Calendar.YEAR));
//        System.out.println(myCalendar.get(Calendar.MONTH)+1);
//        System.out.println(myCalendar.get(Calendar.DAY_OF_WEEK));   // 요일
//        System.out.println(myCalendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(myCalendar.get(Calendar.HOUR));
//        System.out.println(myCalendar.get(Calendar.MINUTE));
//        System.out.println(myCalendar.get(Calendar.SECOND));

////        java.time패키지의 LocalDateTime, LocalDate, LocalTime 클래스
//        LocalDate myLocalDate=LocalDate.now();
//        System.out.println(myLocalDate.getYear());
//        System.out.println(myLocalDate.getMonth());
//        System.out.println(myLocalDate.getDayOfWeek());
//        System.out.println(myLocalDate.getDayOfMonth());
//
//        LocalTime myLocalTime=LocalTime.now();
//        System.out.println(myLocalTime.getHour());
//        System.out.println(myLocalTime.getMinute());
//        System.out.println(myLocalTime.getSecond());
//
        LocalDateTime myLocalDateTime=LocalDateTime.now();
        System.out.println(myLocalDateTime.getYear());
        System.out.println(myLocalDateTime.getHour());
//        ChronoField 매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(myLocalDateTime.get(ChronoField.YEAR));
        System.out.println(myLocalDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(myLocalDateTime.get(ChronoField.AMPM_OF_DAY));   // 0이면 오전, 1이면 오후
        System.out.println(myLocalDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시 체계

//        .of : 임의로 특정 시간정보 객체를 만들어내고 싶을 때 사용
        LocalDate birthday=LocalDate.of(2000, 11, 12);
        System.out.println(birthday);

        LocalDateTime birthdayTime=LocalDateTime.of(2000, 11,12,15,14,10);
        System.out.println(birthdayTime);

    }
}
