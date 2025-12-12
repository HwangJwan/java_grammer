package C01Basic;

import java.util.*;

public class C10List {
    public static void main(String[] args) {
//        List 선언방법1
//        ArrayList<String> myList1=new ArrayList<String>();
//        ArrayList<String> myList2=new ArrayList<>();
//
////        List 선언방법2 : 가장 일반적
//        List<String> myList3=new ArrayList<>();
//
////        초기값 세팅방법1 : 개별 데이터 add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
////        초기값 세팅방법1 : 배열을 리스트로 변환
//        String[] arr={"java","python","C++"};
//        List<String> myList4=new ArrayList<>(Arrays.asList(arr));
//
////        List의 출력
////        List등의 CollectionFramework안에는 toString메서드가 구현되어 있고, 자동호출
//        System.out.println(myList4);
//
////       List안의 자료타입으로는 기본형 타입은 쓸 수 없음
//        int[] intArr={10,20,30};
//        List<Integer> myList5=new ArrayList<>();
//        for(int i:intArr) {
//            myList5.add(i);
//        }

//        add : List에 값을 하나씩 추가하는 메서드
//        List<Integer> myList=new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30);   // List는 중간위치에 데이터를 삽입/삭제하는 작업은 비효율적
//        System.out.println(myList);
//
////        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(2));
//
////        size : 리스트의 개수(길이) 반환
//        System.out.println(myList.size());
//
////        리스트의 값 출력 방법1 : 일반 for문
//        for(int i=0;i<myList.size();i++) {
//            System.out.println(myList.get(i));
//        }
//
////        리스트의 값 출력 방법2 : 향상된 for문
//        for(int a:myList) {
//            System.out.println(a);
//        }

//        remove : 값을 삭제
//        List<Integer> myList=new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.remove(myList.size()-1);
//        System.out.println(myList);

//        indexOf : 특정값을 찾아 index return (가장먼저 나오는값)
//        List<Integer> myList=new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(30);
//        System.out.println(myList.indexOf(30));
//
////        contains : 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList.contains(20));

//        프로그래머스 : n의 배수 고르기

//        정렬 방법1 : Collections클래스의 sort메서드 사용, 객체의 sort메서드 사용)
//        List<Integer> myList=new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
//
//        Collections.sort(myList);
//        Collections.sort(myList,Comparator.reverseOrder()); // 내림차순
//        System.out.println(myList);
//
//        myList.sort(Comparator.naturalOrder()); // 오름차순
//        myList.sort(Comparator.reverseOrder()); // 내림차순

//        이중리스트 : 리스트안의 리스트
//       {{1,2,3},{4,5,6}}
//        List<List<Integer>> myList=new ArrayList<>();
//        List<Integer> m1=new ArrayList<>();
//        myList.add(m1); //[[]]
//        myList.add(new ArrayList<>()); //[[],[]]
//        m1.add(1);
//        m1.add(2);
//        m1.add(3); //[[1,2,3],[]]
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6); //[[1,2,3],[4,5,6]]
//        System.out.println(myList);

//        [[1,2,3],[4,5,6],[7,8,9]...,[58,59,60]]
//        List<List<Integer>> myList=new ArrayList<>();
//        int input=1;
//        for(int i=0;i<20;i++) {
//            myList.add(new ArrayList<>());
//            for(int j=0;j<3;j++) {
//                myList.get(i).add(input);
//                input++;
//            }
//        }
//        System.out.println(myList);

//        리스트안의 배열
//        [{10,20},{1,2,3},{4,3,2,1}]
        List<int[]> list=new ArrayList<>();
        int[] arr1=new int[2];
        int[] arr2=new int[3];
        int[] arr3=new int[4];
        arr1[0]=10;
        arr2[1]=20;
        list.add(arr1);
        list.add(new int[3]);
        list.get(1)[0]=1;
        list.get(1)[1]=2;
        list.get(1)[2]=3;
        list.add(new int[]{4,3,2,1});
        System.out.println(list); //배열주소값 출력 [배열주소1, 배열주소2, 배열주소3]
        for(int i=0;i<list.size();i++) {
            System.out.print(Arrays.toString(list.get(i)));
        }















    }
}
