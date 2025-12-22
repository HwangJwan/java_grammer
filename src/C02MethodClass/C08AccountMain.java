package C02MethodClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08AccountMain {
    public static void main(String[] args) {
//        계좌개설(객체생성)
//        List를 계좌 객체를 담는 자료구조로 사용 2~3개
//        List<account> myList=new ArrayList<>();
//        myList.add(new account("Juwan","12345",5000000));
//        myList.add(new account("hong","54321",0));
//        myList.add(new account("kim","12341234",100000));
//
//
////        계좌1(계좌번호12345)에서 계좌2(54321)로 송금 : 잔고변경 메서드 필요
//        for(account a: myList) {
//            if(a.getAccountNumber().equals("12345")) {
//                a.setBalance(a.getBalance()-50000);
//            }
//            if(a.getAccountNumber().equals("54321")) {
//                a.setBalance(a.getBalance()+50000);
//            }
////            객체마다 계좌번호가 1234, 54321인 것 찾기
////            내객체를 찾아서 50000원을 차감하고 상대방 객체를 찾아서 50000원을 가산
//        }
//        맵을 계좌객체를 담는 자료구조로 사용
        Map<String, account> accountmap = new HashMap<>();
        accountmap.put("12345", new account("hong1", "12345", 1000000));
        accountmap.put("54321", new account("hong2", "54321", 0));

        account a = accountmap.get("12345");
        account b = accountmap.get("54321");

        a.transfer(b, 50000);
        System.out.println(accountmap);

    }
}


// account클래스 - 계좌주명(name - String), 계좌번호(accountNumber - String), 잔고(balance-long)
class account {
//    참조자료형은 초기값 null
    private Long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;
//    원시자료형은 각 자료에 맞는 초기값
    public account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        staticId++;
        this.id=staticId;
    }

    public account() {

    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    //    setBalance보다는 의도를 명확히한 메서드명을 사용하기를 권장
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void transfer(account targetAccount, long money) {
//        송금할 객체에서 돈을 차감
        if (this.balance >= money) {
            this.balance -= money;
        } else {
            System.out.println("금액이 부족합니다.");
            return;
        }
//        송금받을 객체에 돈을 가산
        targetAccount.balance += money;
    }

    @Override
    public String toString() {
        return "{" +"id="+id+
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

