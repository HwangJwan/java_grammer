package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//    변수의 명명규칙
//    변수명에 의미의 분절이 일어나는 경우에는 camelcase 또는 _사용
//        String myFirstName = "honggildong";
//        String my_first_name = "honggildong";
//
////    정수 : byte(1바이트), int(4바이트), long(8바이트)
//        byte a = 127;
//        byte b = -128;
//
////    자료형이 표현할 수 있는 범위를 넘어선경우 오버플로우/언더플로우 발생
////    오버플로우
//        a++;
//        System.out.println(a);
////    언더플로우
//        b--;
//        System.out.println(b);
//        long l1 = 10;
////     long은 명시적으로 L을 붙여서 해당값이 long 타입임을 명시
//        long l2 = 20L;
//        System.out.println(l1 + l2);
//
////        실수 : float, double
//        float f1=1.123f;
//        double d1=1.123;

//        실수 연산은 기본적으로 오차 발생 : 소수점을 2진법으로 표현하는 부돛소수점을 사용하기 때문
//        double d2=0.1;
////        미세한 오차는 소수점 절사를 통하여 당장에는 드러나지 않음
//        System.out.println(d2);
////        부동소수점 오차 테스트
//        double total=0;
//        for(int i=0;i<1000;i++) {
//            total+=0.1;
//        }
//        System.out.println(total);
//
////    소수점 연산 오차 해결 방법1 : 소수를 정수로 변환 후 추후 나눗셈으로 다시 변환
//        double total2=0;
//        for(int i=0;i<1000;i++) {
//            total2+=(0.1*10);
//        }
//        System.out.println(total2/10);
//
//        소수점 연산 오차 해결 방법2 : BigDecimal 클래스 사용
//        double d1=1.03;
//        double d2=0.42;
//        System.out.println(d1-d2);
////        값을 입력받아 저장할 때부터 문자로 압력을 받아 오차문제를 해결한다
//        BigDecimal b1=new BigDecimal("1.03");
//        BigDecimal b2=new BigDecimal("0.42");
//        double result=b1.subtract(b2).doubleValue();
//        System.out.println(result);
//
////        문자형 : char - 1글자, String - 1글자 이상
//        char c1='가';
//        String st1="가";
////        String 또는 char 배열 최초 선언시에는 초기값이 null이 할당
//        String[] stArr=new String[10];
//        System.out.println(stArr[0]);
//
//        null은 값이 없다는 의미로서 하나의 타입
//        String st1="";          // 빈 문자열이 할당
//        String st2=null;        // null이 할당 st2는 더이상 String이 아님
//        System.out.println(st1.isEmpty());  // true
//        System.out.println(st2.isEmpty());  // error
//
////        String 또는 char
//        String[] stArr=new String[5];
//        stArr[1]="helloworld;]dw";
//        stArr[3]="helloworld;]dw";
//        for(int i=0;i<stArr.length;i++) {
//            System.out.println(stArr[i].length());
//        }
//
////         boolean : true of flase
////        boolean b1=false;
////        if(b1) {
////            System.out.println("참입니다");
////        }
////            else {
////                System.out.println("거짓입니다");
////            }
//
////        타입 변환 : 작은 타입에서 큰타입으로의 변환은 문제없이 변환
////        int -> long 문제없음

//             int i1=10;
//            long l1=i1;  // 문제 없음
//
////        int 0> double
//        int i2=10;
//        double d2=i2;
//        System.out.println(d2);
//
////        double -> int : 기본적으로는 허용 불가, 명시적 형변환은 가능
//        double d3=10.5;
//        int i3= (int) d3;
//        System.out.println(i3);
//        정수/정수의 두 수가 모두 정수이면 소수점 절사 문제
////        두 수중에 하나를 double로 뱐화시켜야함
//        int a=1;
//        int b=4;
//        int i = a / b;
//        double d2=(double)a/b;
//        System.out.println(d2);
//

//        char -> int 문제 없음
//            char c1='a';
//            int i1=(int)c1;
//            int i2=c1;
//        System.out.println(i1);
//        System.out.println(i2);
////        예시) 문자비교를 위한 묵시적 타입변환
//        System.out.println('a'>'b');
//
//        문제) 알파벳 소문자 갯수 세기
        String st1="01abcd123한글AZ123";
        int count=0;
        for(int i=0;i<st1.length();i++) {
            char ch=st1.charAt(i);
            if('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z') {
                count++;
            }
        }
        System.out.println(count);

//        변수와 상수
//        변수 : 변수는 재할당 가능, 재선언은 불가능
        int a1=10;
        a1=20;
//        int a1=30;

//        상수 : 값의 재할당 불가능 (정해진 값, 고정된 값을 사용시 상수 활용)
        final double pi=3.14;
//        pi=3.15;

    }
}
