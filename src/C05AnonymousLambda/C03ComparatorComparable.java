package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
//    javaㅁ에서는 비교를 위한 인터페이스 대표적으로 2개 제공
//    Comparator인퍼테이스 : 인터페이스 내 compare메서드만 존재
//    Comparable인터페이스 : 인터페이스 내 compareTo메서드만 존재
public static void main(String[] args) {
    List<Integer> myList =new ArrayList<>();
    myList.add(20);
    myList.add(10);
    myList.add(30);
//    java의 대부분의 정렬함수는 매개변수로 Comparator객체 요규
    myList.sort(Comparator.naturalOrder());
//    o1과 o2의 숫자값을 마이너스 형식으로 코딩을 하되,
//    o1이 먼저있으면 오름차순, o2가 먼저 있으면 내림차순
    myList.sort((o1, o2) -> o1-o2);

    List<String> myList2=new ArrayList<>();
    myList2.add("java");
    myList2.add("python");
    myList2.add("c++");
//    기본적인 문자열 정렬일 때에는 Comparator커스텀을 하지 않고,
//    복잡한 자신만의 정렬기준을 가지고 정렬해야할 때 Comparator 익명객체 생성
//    ex) 문자열의 길이로 정렬하되, 문자열의 길이가 같은 경우에는 알파벳 순으로 정렬
    Collections.sort(myList2, (o1, o2) -> {
        if(o1.length()!=o2.length()) {
            return o1.length()-o2.length();
        }
        else {
            return o1.compareTo(o2);
        }
    });
    System.out.println(myList2);

//      백준 : 단어 정렬

//    배열, 리스트 정렬 외에 java의 그외 정렬자료구조
    Queue<String> pq=new PriorityQueue<>((o1, o2) -> o1.length()-o2.length());
    Set<String> treeSet=new TreeSet<>((o1, o2) -> o1.length()-o2.length());

//    백준 : 절댓값 힙
//    백준 : 선 긋기
//    리스트안의 배열정렬
//    [{4,5},{1,2},{5,0},{3,1}]

//    리스트 안의 배열의 1번째 인덱스를 기준으로 오름차순 정렬
//    List<int[]> list=new ArrayList<>();
//    list.add(new int[]{4,5});
//    list.add(new int[]{1,2});
//    list.add(new int[]{5,0});
//    list.add(new int[]{3,1});
//
//    list.sort(new Comparator<int[]>() {
//        @Override
//        public int compare(int[] o1, int[] o2) {
//            if(o1==o2) {
//                return o1[0]-o2[0];
//            }
//            return o1[1]-o2[1];
//        }
//    });
//    for(int[] a:list) {
//        System.out.println(Arrays.toString(a));
//    }

//    직접 만든 객체 정렬
//    방법 1 : Comparator를 구현한 익명객체 방식
    List<Student> list=new ArrayList<>();
    list.add(new Student("hong1",17));
    list.add(new Student("Kim",36));
    list.add(new Student("Park",10));
    list.add(new Student("Lee",27));

    list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    for(Student a:list) {
        System.out.println(a.toString());
    }

//    방법 2 : Comparable을 구현한 방식
//    Student객체 안에 Comparable 을 implements하는 방식
//    sort실행 시 자동으로 Student안의 compareTo메서드 호출
    Collections.sort(list);
    for(Student a:list) {
        System.out.println(a.toString());
    }
    }
}

class Student implements Comparable<Student> {
// class Student{
    private String name;
    private int age;

    public Student( String name,int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    Comparable의 compareTo에서는 this와 매개변수로 주어지는 객체와 비교
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}