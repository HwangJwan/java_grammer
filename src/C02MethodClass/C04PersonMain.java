package C02MethodClass;

public class C04PersonMain {
    public static void main(String[] args) {
//        회원가입 예시
//        String name1="homg1";
//        String email1="hong1@naver.com";
//        int age1=30;
//        printNumber(name1,email1,age1);
//        String name2="homg2";
//        String email2="hong2@naver.com";
//        int age2=40;
//        printNumber(name2,email2,age2);
////        a
////        클래스에 속성을 정의하여, 사람 객체로 생성

//        C04Person p1= new C04Person();
//        p1.name="hong1";
//        p1.email="hong1@naver.com";
//        p1.age=30;

//        C04Personrson p2=new C04Person();
//        p2.name="hong2";
//        p2.email="hong2@naver.com";
//        p2.age=30;
//        위 코드의 문제점
//        1) person객체의 변수에 외부 클래스에서 접근 가능
//        2) person에 대한 출력 코드가 외부 클래스마다 중복되어 들어갈 여지 있음
//        printNumber2(p1);
//        printNumber2(p2);
        C04Person p3=new C04Person();
        p3.setName("hong3");
        p3.setEmail("hong3@naver.com");
        p3.setAge(25);
        printNumber2(p3);
        System.out.println(p3.returnPersonInfo());



    }

//    사용자정보 출력 메서드(printMember)
//    예시 이름은 xx, 이메일은 yy, 나이는 zz입니다.
    public static void printNumber(String name,String email,int age) {
        System.out.println("이름은 "+name+", 이메일은 "+email+", 나이는 "+age+"입니다.");
    }
    public static void printNumber2(C04Person person) { // 객체의 주소값이 매개변수로 전달
//        System.out.println("이름은 "+person.name+", 이메일은 "+person.email+", 나이는 "+person.age+"입니다."); 변수의 안정성 깨질 수 있음
        System.out.println("이름은 "+person.getName()+", 이메일은 "+person.getEmail()+", 나이는 "+person.getAge()+"입니다.");
    }


}
