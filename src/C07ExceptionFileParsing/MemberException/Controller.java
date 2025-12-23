package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 코드작성, 예외처리
// 사용하자 인터페이싱(입출략)하는 계층
public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberservice = new MemberService();
        while (true) {
            System.out.println("1번 : 회원가입, 2번 : 회원상세조회, 3번 : 회원목록조회, 4번 : 로그인");
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("회원가입 서비스입니다.");
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("email을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                String password = sc.nextLine();
//                회원가입시 발생하는 예외를 적절히 try/catch
                try {
                    memberservice.register(name, email, password);
                } catch (IllegalArgumentException e) {
                    e.getMessage();
                    e.printStackTrace();
                }
            } else if (input.equals("2")) {
                System.out.println("회원상세조회 서비스입니다.");
                System.out.println("회원 ID를 입력해주세요");
                try {
                    long id = Long.parseLong(sc.nextLine());
//                회원 상세조회시 발생하는 예외를 적절히 try/catch
                    try {
                        Member member = memberservice.findById(id);
                        System.out.println(member);
                    } catch (IllegalArgumentException e) {
                        System.out.println("존재하지 않는 ID입니다.");
                        e.printStackTrace();
                    }
                } catch (NumberFormatException e) {
                    e.getMessage();
                    e.printStackTrace();
                }

            } else if (input.equals("3")) {
                System.out.println("회원목록조회 서비스입니다.");
                List<Member> memberList = memberservice.findAll();
                System.out.println(memberList);
            } else if (input.equals("4")) {
                System.out.println("로그인 서비스입니다.");
                System.out.println("email을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                String password = sc.nextLine();
//                예외처리 : 예외발생시 원인 출력
                try {
                    memberservice.login(email, password);
                    System.out.println("로그인 성공입니다.");
                } catch (NoSuchElementException e) {
                    e.getMessage();
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    System.out.println("잘못된 비밀번호입니다.");
                    e.printStackTrace();
                }
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}