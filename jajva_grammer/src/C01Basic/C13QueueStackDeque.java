package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) {
//        Queue인터페이스를 LinkedList를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue=new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll은 큐에서 가장 앞의 데이터를 삭제하면서 return하는 메서드
//        int value=myQue.poll();
//        System.out.println(value);  // 10
//        System.out.println(myQue);  // 20, 30
////        peek은 큐에서 데이터를 삭제하지 않고 가장 앞의 데이터를 return하는 메서드
//        int value2=myQue.peek();
//        System.out.println(value2); // 20
//        System.out.println(myQue);  // 20, 30

//        while문을 통한 queue 출력 방식
//        Queue<String> printeQueue=new LinkedList<>();
//        printeQueue.add("문서1");
//        printeQueue.add("문서2");
//        printeQueue.add("문서3");
//        printeQueue.add("문서4");
////       큐는 일반적으로 while문을 통해 요소를 소모
//        while(!printeQueue.isEmpty()) {
//            System.out.println(printeQueue.poll());
//        }

//        LinkedList와 ArrayList의 성능차이 비교
//        ArrayList의 장점 : 조회성능빠름. 단점 : 중간 삽입/삭제의 성능 저하
//        LinkedList의 장점 : 중간 삽입/삭제의 성능 빠름, 단점 : 조회 성능 저하
//        LinkedList<Integer> myLinkedList=new LinkedList<>();
//        long startTime=System.currentTimeMillis();
//        for(int i=0;i<1000000;i++) {
//            myLinkedList.add(0,i);
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.println("LinkedList에 중간에 값 add 시에 소요시건 : "+(endTime-startTime));
//
//        ArrayList<Integer> myArrayList=new ArrayList<>();
//        long startTime2=System.currentTimeMillis();
//        for(int i=0;i<1000000;i++) {
//            myArrayList.add(0,i);
//        }
//        long endTime2=System.currentTimeMillis();
//        System.out.println("ArrayList에 중간에 값 add 시에 소요시건 : "+(endTime2-startTime2));

//        관련문제 : 카드2, 요세푸스 문제제

//        길이제한 큐
//        Queue<String> blockingQueue=new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4");   // 길이 초과시 에러 발생
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");   // 제한된 길이까지만 add, 에러발생 X
//        System.out.println(blockingQueue);

//        우선순위 큐 : 데이터를 poll할 때 정렬된 데이터 결과값(최소값/최대값) 보장
//        지속적으로 데이터가 추가/제거되면서 전체 데이터가 실시간으로 변경되는 상황에 사용
//        한번만 정렬해서 최소값 뽑을거면 list써도 무방
//        Queue<Integer> pq=new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        while(!pq.isEmpty()) {
////            poll할때마다 최소값을 추출하게 되고 복잡도 log(n), peek은 최소값 확인만하고 추출 X 복잡도 log(n)
////            전체 데이터를 모두 poll하면 복잡도 n*log(n)
//            System.out.println(pq.poll());
//        }

//        pq에서 데이터 하나를 poll : log(n)
//        pq에서 전체데이터를 모두 poll : n*log(n)
//        list에서 전체데이터를 정렬 : n*log(n)
//        1) 중간중간 값을 add하고 다시 정렬
//        2) n^2*log(n)

//        최소힙

//        프로그래머스 : 더 맵게

//        최대힙 : poll할때마다 최대값 추출
//        Queue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());

//        stack : 후입선출의 자료구조
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println(myStack.pop());  // 마지막에 입력한 값 꺼내는 것
        System.out.println(myStack.peek()); // 마지막에 입력한 값 확읹만 꺼냄 X
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());

//        프로그래머스 : 올바른 괄호, 같은 숫자는 싫어

//        deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.addLast(10);
        myDeque.addLast(20);
        myDeque.addFirst(30);       // 30, 10, 20
        System.out.println(myDeque.pollLast());
        System.out.println(myDeque.pollFirst());
        System.out.println(myDeque.pollFirst());

//        Queue
//        1)LinkedList - 선입선출 2) PQ - 힙자료구조
//        Stack - 마지막값과 지금 집어넣으려고 하는 값 비교
//        Deque - 양방향 데이터 추가/삭제 가능

    }
}
