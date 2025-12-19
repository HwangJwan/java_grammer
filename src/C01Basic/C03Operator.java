package C01Basic;

import java.sql.SQLOutput;

public class C03Operator {
    public static void main(String[] args) {
////        산술연산자 : 사칙연산
//        int n1=10;
//        int n2=3;
////        * : 곱셈 / : 나눗셈(몫) % : 나머지
//        System.out.println("n1 * n2 = " + (n1*n2));
//        System.out.println("n1 / n2 = " + (n1/n2));
//        System.out.println("n1 % n2 = " + (n1%n2));
//
//        대입 연산자
//        int n=7;
//        n+=7;
//        n-=7;
//        n*=7;
//
//        int n1=7;
//        int n2=7;
//        int n3=7;
//
//        n1=n1-3;
//        n2-=3;
//        n3=-3;
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//
//        int n4=10;
//        int n5=10;
//        n4/=3;   //3
//        n5%=3;   //1
//        System.out.println(n4);
//        System.out.println(n5);
//
//        증감 연산자
//        int a=10;
//        a=a+1;
//        System.out.println(a);
//        a+=1;
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//        ++a;
//        System.out.println(a);

//        a++ : 후위증감연산자 - 현재 라인의 명령문이 실행되고 나서 증가
//        ++a : 전위증감연산자 - 현재 라인의 명령문이 실행되기 전에 증가
//        int b=5;
//        int c=b++;
//        System.out.println(c);  //c:5
//        int d=++b;
//        System.out.println(d);  //d:7
//
//        비교연산자 : ==. !=. >, >=
//        int n1=10;
//        int n2=20;
//        System.out.println(n1==n2);
//        System.out.println(n1!=n2);
//        if(n1>n2) {
//            System.out.println("n1이 n2보다 큽니다.");
//        }
//
//        논리연산자 : &&, ||, !
//        int n1=10;
//        int n2=20;
//        boolean b1=!(n1>5 && n1<7);
//        System.out.println(b1);

//        비트연산자 : 비트연산은 컴퓨터의 2진 체계에서의 회선방식. & .|. ^,>>,<<
        int n1=5;
        int n2=4;
        System.out.println(n1&n2 );
        System.out.println(n1|n2);


//         n의 값을 왼쪽으로 1칸 옮긴다는 의미는 해당 숫자값에 X2한다는 의미
        System.out.println(n2>>2); //1






    }
}
