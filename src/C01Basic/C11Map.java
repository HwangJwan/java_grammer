package C01Basic;

import java.util.*;

public class C11Map {
    public static void main(String[] args) {
//        map : key, value로 이루어진 자료구조
//        Map<String, Integer> sports=new HashMap<>();
////        특징 : 키는 중복없음, value는 중복가능
//        sports.put("농구",2);
//        sports.put("축구",3);
//        sports.put("배구",2);
//        sports.put("농구",3);
//////        특징 : map key에는 순서가 없음 = index없음
////        System.out.println(sports);
//////        특징 : map에서 key를 통한 검색 복잡도는 O(1) - 매우빠름
////        System.out.println(sports.get("배구"));
//
////        map의 전체 value데이터 출력
////        map의 키값 접근시에는 index사용 불가능(순서X)
////        keySet() : map의 전체 key목록을 반환하는 메서드
//        for(String a: sports.keySet()) {
//            System.out.println("key : "+a+" value : "+sports.get(a));
//        }
//
////        values : map의 전체 value 목록을 반환 - 잘안쓰임
//        for(int a:sports.values()) {
//            System.out.println(a);
//        }

//        Map<String, Integer> sports=new HashMap<>();
//        sports.put("축구", 2);
//        sports.put("농구", 3);
//        sports.put("배구", 2);
//
////        remove : key를 통해 map요소 삭제
//        sports.remove("축구");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("배구",10);
//        System.out.println(sports);
//
////        containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("배구"));
//        System.out.println(sports.containsKey("탁구"));

//        Map을 통한 개수 count
//        String[] arr={"농구","축구","농구","야구","축구"};
//        Map<String,Integer> myMap=new HashMap<>();
//        for(String a:arr) {
//            if(myMap.containsKey(a)) {
//                myMap.put(a,myMap.get(a)+1);
//            }
//            else {
//                myMap.put(a,1);
//            };        // =myMap.put(a,myMap.getOrDefault(a,0)+1);
//        }
//        System.out.println(myMap);
////          getOrDefault(키값, 초기값) : key값이 없을 경우 초기값 리턴, 있는 경우 있는 값 리턴
//
////          map의 value값 감소로직
//        String[] arr2={"농구","농구","야구","축구"};
//        for(String a:arr2) {
//            if(myMap.containsKey(a)) {
//                myMap.put(a,myMap.get(a)-1);
//                if(myMap.get(a)<=0) {
//                    myMap.remove(a);
//                }
//            }
//        }
//        System.out.println(myMap);

//          프로그래머스 - 완주하지 못한 선수

//        프로그래머스 - 의상

//        가장 value가 큰 key값 찾기
//        Map<String,Integer> myMap=new HashMap<>();
//        myMap.put("축구",3);
//        myMap.put("농구",2);
//        myMap.put("야구",1);
//
//        int max=Integer.MIN_VALUE;
//        String maxKey="";
//        for(String a:myMap.keySet()) {
//            int value=myMap.get(a);
//            if(max<value) {
//                max=value;
//                maxKey=a;
//            }
//        }

//        백준 - 베스트셀러

////        TreeMap : key를 정렬(오름차순)하여 map을 저장
//        Map<String, Integer> myMap=new TreeMap<>();
////        Map<String, Integer> myMap=new TreeMap<>(Comparator.reverseOrder()); 내림차순
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//        System.out.println(myMap);

//        백준 - 파일정리

//        Linked HashMap : 데이터의 삽입순서 보장(입력 시간순 정렬)
//        Map<String, Integer> myMap = new LinkedHashMap<>();
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//        for (String a : myMap.keySet()) {
//            System.out.println(a + " " + myMap.get(a));
//        }

//        iterator를 활용한 출력
        Map<String, Integer> myMap=new HashMap<>();
        myMap.put("야구", 2);
        myMap.put("축구", 3);
        myMap.put("농구", 2);
        Iterator<String> iters=myMap.keySet().iterator();
////        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iters.next());
////        hasNext메서드는 iterator안에 그 다음값이 있는지 없는지 boolean 리턴
//        System.out.println(iters.hasNext());
        while(iters.hasNext()) {
            System.out.println(iters.next());
        }

    }
}
