package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C04GenericMain {
    public static void main(String[] args) {
//        String[] stArr={"java","python","c++"};
//        stChange(stArr,0,1);
//        System.out.println(Arrays.toString(stArr));
//
//        Integer[] intArr={10,20,30};
//        intChange(intArr,0,1);
//        System.out.println(Arrays.toString(intArr));
//
//        allChange(stArr,1,2);
//        allChange(intArr,1,2);
//        System.out.println(Arrays.toString(stArr));
//        System.out.println(Arrays.toString(intArr));

//        제네릭을 사용한 객체 생성
        GenericPerson<String> p1=new GenericPerson("honggildong");
        GenericPerson<Integer> p2=new GenericPerson(20);
        System.out.println(p1.getValue());

//        제네릭의 사용예시
        List<String> myList=new ArrayList<>();
        Stream<String> myStream;
        Optional<Student> myStudent;


    }
    static void stChange(String[] stArr,int from,int to) {
        String temp="";
        temp=stArr[from];
        stArr[from]=stArr[to];
        stArr[to]=temp;
    }

    static void intChange(Integer[] intArr,int from,int to) {
        int temp=0;
        temp=intArr[from];
        intArr[from]=intArr[to];
        intArr[to]=temp;
    }

//    제네릭 메서드는 반환타입 왼쪽에 <T>라고 선언
//    이때 T는 참조형 변수인 객체타입만을 허용
    static <T> void allChange(T[] arr,int from,int to) {
        T temp;
        temp=arr[from];
        arr[from]=arr[to];
        arr[to]=temp;
    }
}

class GenericPerson<T>{
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
