package C02MethodClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.spi.CalendarDataProvider;

public class C07Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성
        Calendar cal=new Calendar("2025","12","16");
//        캘린더 객체 출력
        System.out.println(cal);

//        java자료구조 내에 직접 만든 객체를 담아 관리
        List<Calendar> myList=new ArrayList<>();
        myList.add(cal);
        myList.add(new Calendar("2015","05","25"));
//        myList 안에는 Calendar 객체의 주소가 들어가있음
        System.out.println(myList);
//        toString() 메서드 구현하여 주소값 대신 값 잘 출력됨

    }
}
//클래스명 : Calendar 변수 : year, month, day 모두 String
class Calendar {
    private String year;
    private String month;
    private String day;

//    생성자 : 객체가 만들어지는 (new)시점에 호출되는 메서드
//    생성자 특징 : 1) 클래스명과 메서드명 동일 2) 반환타입 없음(void X)
//    생성자 사용 목적 : 객체 생성 시점에 객체 변수값들을 초기화(세팅) 변수의 안정성을 위해 setter사용을 지양하고, 생성자를 사용한다
    public Calendar(String year, String month, String day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }
//    직접 생성자를 한 개라도 추가할 경우, 초기(기본)생성자는 무시가 되므로, 필요시 별도로 추가
    public Calendar() {

    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
//        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
//        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
//        this.day = day;
    }

//    public String returnDateInfo() {
//        return this.year+"년 "+this.month+"월 "+this.day+"일입니다.";
//    }
//    toString() 메서드는 객체명으로 출력 시, 자동으로 메서드가 호출
    @Override
    public String toString() {
        return "{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}


//클래스 기본구조
//클래스명 {
//  변수 1;
//  변수 2;
//  ...
//  생성자
//  getter
//  toString

//  게시판