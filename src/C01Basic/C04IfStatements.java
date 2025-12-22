package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C04IfStatements {
    public static void main(String[] args) throws IOException {
//        도어락 키 예제
//        String answer="1234";
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String pwd=br.readLine();
//        if(pwd.equals(answer)) {
//            System.out.println("문이 열렸습니다.");
//        }
//        else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//
//        교통카드 예제
//        System.out.println("현재 가지고 있는 돈은 얼마인가요?");
//        사용자가 가지고 있는 돈을 int로 입력 받는다. 10000원 이상이면 택시를 타시오 출력
//        10000원 미만 3000원 이상이면 버스를 타시오 출력
//        3000원 미만이면 걸어가시오 출력
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int money=Integer.parseInt(br.readLine());
//        if, else if 구문에서 조건식은 택1. 즉, 한 조건에 해당하면 실행 후 구문 밖으로 빠져나감.
//        if(money>=10000) {
//            System.out.println("택시를 타시오");
//        }
//        else if(3000<=money) {
//            System.out.println("버스를 타시오");
//        }
//        else {
//            System.out.println("걸어가시오");
//        }

//        if문을 독립적으로 따로 두고 싶은 경우에는 정확한 범위 지정을 통해 if문이 중복되어 실행되지 않도록 한다
//        if(money>=10000) {
//            System.out.println("택시를 타시오");
//        }
//        if(3000<=money && money<10000) {
//            System.out.println("버스를 타시오");
//        }
//        if(money<3000) {
//            System.out.println("걸어가시오");
//        }

//        삼항연산자 : 결과값 = 조건식 ? 반환값1, 반환값2
//        String answer="1234";
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String pwd=br.readLine();
//        String result=pwd.equals(answer) ? "문이 열렸습니다" : "비밀번호가 틀렸습니다";
//        System.out.println(result);

//        switch문 : if, else if, else if등 여러개의 조건문을 가독성 있게 표현한 구문
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
//       input과 case의 값들은 equal관계이고, 구문마다 반드시 break를 넣어줘야함
//       default는 그외의 의미로서 else와 같은 역할
        switch (input) {
           case 1:
               System.out.println("대출 업무입니다");
               break;
           case 2:
               System.out.println("예금 업무입니다");
               break;
           case 3:
               System.out.println("적금업무입니다");
               break;
           default:
               System.out.println("잘못된 입력입니다");
               break;
       }
    }
}
