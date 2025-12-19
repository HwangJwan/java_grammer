package C02MethodClass;

/*
        <계좌개설 및 입출금 서비스>
        1.계좌객체 : id(auto_increment Long), name(String), accountNumber(String), balance(long)
        2.자료구조 :  계좌객체를 담아둘 자료구조는 Map
        3.서비스 기능 사용하실 서비스 번호를 입력해주세요
            3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
            3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호번호, 잔고를 보기좋게 출력
            3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
            3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
            3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
        4.주의사항
            4-1)프로그램은 상시적 실행될수 있도록 전체코드를 while(true)처리
            4-2)main메서드에서 입출력 처리를 하고, 입금(deposit), 출금(withdraw), 송금(transfer)기능에 대한 핵심 메서드는 BankAccount클래스에 생성.
         */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class C09BankService {
    public static void main(String[] args) throws IOException {
        Map<String ,BankAccount> accountMap=new HashMap<>();
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("사용하실 서비스 번호를 입력해주세요\n1 : 계좌개설\n2 : 계좌조회\n3 : 입금\n4 : 출금\n5 : 송금");
            int num = Integer.parseInt(br.readLine());

            if (num == 1) {    //계좌개설
                System.out.println("이름과 사용하실 계좌번호와 현재 가지고있는돈을 입력하세요.");
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String accountNum = st.nextToken();
                long balance = Long.parseLong(st.nextToken());
                if (accountMap.containsKey(accountNum)) {
                    System.out.println("이미 있는 계좌입니다.");
                } else {
                    accountMap.put(accountNum, new BankAccount(name, accountNum, balance));
                }
            }
            if (accountMap.isEmpty()) {
                System.out.println("먼저 계좌개설을 해주세요.");
            } else {
             if (num == 2) {   //계좌조회
                    System.out.println("계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요.");
                    String searchNum = br.readLine();

                    BankAccount a = accountMap.get(searchNum);
                    if (a != null) {
                        System.out.println(a.toString());
                    } else {
                        System.out.println("없는 계좌입니다.");
                    }
                } else if (num == 3) {   // 입금
                    System.out.println("계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요.");
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String depositNum = st.nextToken();
                    long money = Long.parseLong(st.nextToken());

                    BankAccount a = accountMap.get(depositNum);
                    System.out.println("입금 전 잔액은 " + a.getBalance() + "원이고,");
                    a.deposit(money);
                    System.out.println("입금 후 잔약은 " + a.getBalance() + "원입니다.");
                } else if (num == 4) {   //출금
                    System.out.println("계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요.");
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String withdrawNum = st.nextToken();
                    long money = Long.parseLong(st.nextToken());

                    BankAccount a = accountMap.get(withdrawNum);
                    if (a.available(money)) {
                        a.withdraw(money);
                        System.out.println("출금 후 잔액은 " + a.getBalance() + "원입니다.");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                } else if (num == 5) {   //송금
                    System.out.println("송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요.");
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String myAccount = st.nextToken();
                    String targetAccountNum = st.nextToken();
                    long money = Long.parseLong(st.nextToken());

                    BankAccount a = accountMap.get(myAccount);
                    BankAccount targetAccount = accountMap.get(targetAccountNum);
                    if (a.available(money)) {
                        a.transfer(targetAccount, money);
                        System.out.println("송금 후 잔액은" + a.getBalance() + "원입니다");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                }
            }
            System.out.println(accountMap);
        }
    }
}

class BankAccount{
    private long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;

    public BankAccount(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        staticId++;
        this.id=staticId;
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

    public void deposit(long money) {
        this.balance+=money;
    }

    public void withdraw(long money) {
        this.balance-=money;
    }

    public void transfer(BankAccount targetAccount, long money) {
        this.balance-=money;
        targetAccount.balance+=money;
    }

    public boolean available(long money) {
        return this.balance >= money;
    }

    @Override
    public String toString() {
        return "{" +
                "이름='" + name + '\'' +
                ", 계좌번호='" + accountNumber + '\'' +
                ", 잔액=" + balance +
                '}';
    }
}
