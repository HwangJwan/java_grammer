package C01Basic;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C12Set {
    public static void main(String[] args) {
//        set의 특성 : 중복X, 순서보장X, 성능 O(1)
        Set<String> mySet=new HashSet<>();
        mySet.add("야구");
        mySet.add("농구");
        mySet.add("야구");
        mySet.add("축구");
        System.out.println(mySet);
        System.out.println(mySet.contains("야구")); //복잡도 O(1)

//        수찾기 문제(1920) -> 다시풀어보기

//        TreeSet : 데이터를 오름차순 정렬
        Set<String> mySet2=new TreeSet<>();
        mySet2.add("야구");
        mySet2.add("농구");
        mySet2.add("야구");
        mySet2.add("축구");
        System.out.println(mySet2);

//        백준 : 숫자카드(10815), 프로그래머스 : 폰켓몬

//        집힙관련함수: 교집합, 합집합, 차집합
//                  retainAll addAll removeAll


        Set<String> s1=new HashSet<>();
        Set<String> s2=new HashSet<>();
        s1.add("java");
        s1.add("python");
        s1.add("C++");
        s2.add("java ");
        s2.add("html");
        s2.add("jcss");
        s1.retainAll(s2); // s1에는 교집합 남음(java)
        s1.addAll(s2); // s1에는 합집합 남음(java,python,c++,html,css)
        s1.removeAll(s2); // s1에는 차집합 남음(python, c++)


    }
}
