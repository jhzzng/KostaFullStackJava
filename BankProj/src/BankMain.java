
public class BankMain {
	public static void main(String[] args) {
        Bank bank = new Bank();  // Bank.java에서 만든 클래스를 bank로 선언
        Loop: while (true) {
            int sel = bank.selectMenu();   // sel 은 Bank클래스에 있는 selectMenu를 복사해옴

            switch (sel) {
                // 스위치문에 sel 을 불러와 selectMenu를 실행시킴 << 굳이이래야하나? 싶음 물어볼것****
                // 스위치문 case가 값이 일치하면 해당 case 문을 작동한다.
                case 0:
                    break Loop;
                case 1:
                    bank.makeAccount();
                    break; // break은 실행문을 작동시키고 스위치문을 종료하기위해 사용
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    bank.withdraw();
                    break;
                case 4:
                    bank.accInfo();
                    break;
                case 5:
                    bank.allAccInfo();
                    break;
                case 6:
                    bank.transfer();
                    break;
            }
        }

    }
}