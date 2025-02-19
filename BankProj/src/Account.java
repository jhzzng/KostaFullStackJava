public class Account {
    String id;
    String name;
    int balance; // Account클래스에 에 문자열 id, 문자열 name, 정수타입 balance 틀을 만듬
    String info() { // 전체 계좌를 조회할때 출력값이 나오도록 만든 것
        return String.format("계좌번호 : %s , 이름 : %s 잔액 : %d", id, name, balance);
    }
    boolean deposit(int money) {
        if(money<=0) {
            return false;
        } // 0원이나 -원을 입금할 수 없으니 if문을 사용해서 false를 띄어!
        balance += money;
        return true;
    }
    boolean withdraw(int money) {
        if(balance<money) {
            return false;
        }
        balance -= money;
        return true;
    }
}
