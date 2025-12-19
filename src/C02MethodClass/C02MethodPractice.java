package C02MethodClass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C02MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        if (isPrime(input)) {
            System.out.println("입력하신 숫자는 소수입니다.");
        } else {
            System.out.println("입력하신 숫자는 소수가 아닙니다.");
        }
    }

//    소수판별기 메서드(isPrime) 상성
//    접근제어자는 public, class메서드, 반환타입 boolean 매개변수 int 단일숫자

    public static boolean isPrime(int num) {
        if (num <= 1) {
//            메서드에서 return을 만나면 메서드가 강제 종료
            return false;
        } else {
            for (int i = 2; i * i < num; i++) {
                if (num % i == 0) {
                   return false;

                }
            }
        }
        return true;
    }

    public static void voidMethod() {
        if(true) {
//            void 메서드에서 return은 메서드 강제종료 목적으로 사용
            return;
        }
        System.out.println("Hello world");
    }


}
