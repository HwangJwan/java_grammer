package C03Inheritance;

// 부모클래스를 상속받을 때 자식 객체의 생성자에서는 부모객체를 자동으로 생성
// 이때, 부모클래스에 기본생성자가 없으면 자식클래스에서 에러 발생
public class C02SuperKeyword extends SuperParents {
    int a;
    public C02SuperKeyword() {
//        super(); : 부모클래스의 생성자를 호출하는 메서드
        super(10);
        this.a=20;
    }

    public static void main(String[] args) {
        C02SuperKeyword c1 = new C02SuperKeyword();
        c1.display();

    }

    public void display() {
        System.out.println("자식의 변수 : " + this.a);
//        부모의 변수나 메서드에 접근할 때는 super 키워드 사용
        System.out.println("부모의 변수 : " + super.a);
    }

}

class SuperParents {
    int a;

    public SuperParents(int a) {
        this.a = a;
    }
}

//1. Animal이름의 클래스 생성
//-void sound() 메서드 : "동뭃이 소리를 냅니다" 출력
//2. Dog 이름의 클래스 생성
//        - Animal 클래스를 상속
//        - sount() 메서드 : "멍멍멍멍" 출력
//3. Cat 이름의 클래스 생성
//        - Animal 상속, sound2() "야옹야옹"