package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

//재귀함수 활용 대표적 알고리즘 : 백트래킹, dfs 알고리즘에서 주로 사용(또는 분할 정복)
//대표적인 백트래킹 예시 : 조합과 순열에서 경우의 수 찾기
public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
//        for(int i=0;i<3;i++) {
//            for(int j=0;j<3;j++) {
//                System.out.println("hello wor 3ld");
//            }
//        }
//         위 for문의 반복횟수는 동적으로 결정되지 않고, 정적으로 코딩할수밖에 없는 한계가 존재
//        recurFor(0,3);

//        List<Integer> myList=new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자조합을 출력 이중리스트에 담아 출력
//        [1,2],[1,3],[1,4],[2,3],[2,4],[3,4]
//        List<List<Integer>> list=new ArrayList<>();
//        for(int i=0;i<myList.size();i++) {
//            for(int j=i+1;j<myList.size();j++) {
//                List<Integer> newList=new ArrayList<>();
//                newList.add(myList.get(i));
//                newList.add(myList.get(j));
//                list.add(newList);
//            }
//        }
//        System.out.println(list);

//        재귀함수를 만들기 위한 for문 변경
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
//        List<List<Integer>> doublelist = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0;i<myList.size();i++) {
//            temp.add(myList.get(i));
//            for(int j=i+1;j<myList.size();j++) {
//                    temp.add(myList.get(j));
//                    doublelist.add(new ArrayList<>(temp));
//                    temp.remove(list.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(doublelist);
//        combi(myList, 2, doublelist, temp, 0); // 원본, 2개짜리 조합, 조합을 담을 이중리스트
//        System.out.println(doublelist);


        List<List<Integer>> doublelist = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited=new boolean[myList.size()];
//        for(int i=0;i<myList.size();i++) {
//            temp.add(myList.get(i));
//            visited[i]=true;
//            for(int j=i+1;j<myList.size();j++) {
//                if(visited[i]) continue;
//                temp.add(myList.get(j));
//                visited[j]=true;
//                doublelist.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//                visited[j]=false;
//            }
//            temp.remove(temp.size()-1);
//            visited[i]=false;
//        }
//        System.out.println(doublelist);

        permu(myList, 2, doublelist, temp ,new boolean[myList.size()* myList.size()]); // 원본, 2개짜리 조합, 조합을 담을 이중리스트
        System.out.println(doublelist);

    }

    public static void recurFor(int start, int end) {
        if (start == end) {
            System.out.println("hello world");
            return;
        }
        for (int i = 0; i < 3; i++) {
//            System.out.println("hello world"); //이렇게 실행하면 3^n 형식이 아님
            recurFor(start + 1, end);




        }
    }

    public static void combi(List<Integer> myList, int n, List<List<Integer>> doubleList, List<Integer> temp, int start) {
        if (temp.size() == n) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(myList, n, doubleList, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void permu(List<Integer> myList, int n, List<List<Integer>> doubleList, List<Integer> temp,boolean[] visited) {
        if (temp.size() == n) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if(visited[i]) continue;
            temp.add(myList.get(i));
            visited[i]=true;
            permu(myList, n, doubleList, temp, visited);
            temp.remove(temp.size() - 1);
           visited[i]=false;
            }
        }
    }


//    백준 : 15649(N과 M) 6603(로또)
