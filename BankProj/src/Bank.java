import java.util.Scanner;

public class Bank {
    // Bank 라는 클래스를 선언
    Account[] accs = new Account[100];
    //    └ Account 클래스 100개의 배열을 accs 에 선언

    int cnt;
    Scanner sc = new Scanner(System.in);
    // └ Scanner는 사용자가 입력할 수 있도록 만드는 도구 / sc라는 참조 변수를 통해서 Scanner를 쓸 수 있음!

    int selectMenu() {
        System.out.println("코스타 은행");
        System.out.println("1.계좌개설");
        System.out.println("2.입금");
        System.out.println("3.출금");
        System.out.println("4.계좌조회");
        System.out.println("5.전체계좌조회");
        System.out.println("6.계좌이체");
        System.out.println("0.종료");
        System.out.println("선택 >> ");
        int sel = Integer.parseInt(sc.nextLine());
        return sel;
    }

    void makeAccount() { // 계좌개설
        System.out.println("[계좌개설]");
        System.out.println("계좌번호:");
        String id = sc.nextLine();
        //너의 계좌번호를 만들어
        System.out.println("이름: ");
        String name = sc.nextLine();
        //너 이름 말해
        System.out.println("입금액: ");
        int money = Integer.parseInt(sc.nextLine());
        //너 얼마 입금할거야?
        Account acc = new Account();
        //Acount클래스 acc를 한개 만들어
        acc.id = id;
        //String id 너가 아까 계좌번호 만든거 acc.id에 넣을게
        acc.name = name;
        // 이름도
        acc.balance = money;
        // 돈도
        accs[cnt++] = acc;
        //acc에 너 계좌 만들었네? 이거 이제 accs배열에 옮길게!
        //cnt에 왜++을 했을까?
        //검색해보니 cnt 로 그냥 했다면 계좌를 만들고 만들어도 그 배열 0번째에 덮어쓰기만 하니까!
    }

    Account searchAccById(String id) {
        Account acc = null;
        for (int i = 0; i < cnt; i++) {
            if (accs[i].id.equals(id)) {
                acc = accs[i]; //아 이건 계좌가 있는지 없는지 찾는 코드구나
                break;
            }
        }
        return acc;
    }

    void deposit() { //입금하는 거 만들거야
        System.out.println("[입금]");
        System.out.println("계좌번호:");
        String id = sc.nextLine(); // 니 계좌번호 써봐
        Account acc = searchAccById(id); //이게 좀 어렵다 ************************
        if (acc == null) { //너가 만약 계좌가 null 없다면 계좌가 틀립니다를 말해
            System.out.println("계좌번호가 틀립니다.");
            return;
        } //맞으면 그냥 if 문을 탈출해
        System.out.println("입금액 : "); // 얼마 입금할래?
        int money = Integer.parseInt(sc.nextLine()); //입력해서 int money에 집어넣어 int 를 쓴이유가
        acc.deposit(money);//오케이 Account로 들어가            //account에서도 int를 지정해서 그런가?*********
        //balance += money; 니까 balance에 너가 입금한 금액이 추가될꺼야

    }

    void withdraw() {
        System.out.println("[출금]");//나 출금하는거 만들꺼야
        System.out.println("계좌번호");
        String id = sc.nextLine();
        Account acc = searchAccById(id); //계좌번호 써봐
        if (acc == null) {
            System.out.println("계좌번호가 틀립니다.");
            return;
        }
        System.out.println("출금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        acc.withdraw(money);

    }

    void accInfo() {
        System.out.println("[계좌조회]"); //계좌조회할게
        System.out.println("계좌번호: ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);
        if (acc == null) {
            System.out.println("계좌번호가 틀립니다.");
            return;
        }
        System.out.println(acc.info()); //Account 클래스문에 있는 info를 가져와 출력해!
    }

    void transfer() {
        System.out.println("[계좌이체]"); //계좌이체할거야
        System.out.println("보내는계좌번호:");
        String sid = sc.nextLine();
        Account sacc = searchAccById(sid);
        if (sacc == null) {
            System.out.println("보내는 계좌번호가 틀립니다.");
            return;// 계좌번호 찾아
        }
        System.out.println("받는계좌번호 : "); //받는 계좌번호 뭐야?
        String rid = sc.nextLine();
        Account racc = searchAccById(rid);
        if (racc == null) {
            System.out.println("받는 계좌번호가 틀립니다.");
            return; // 계좌번호 찾아

        }
        System.out.println("이체금액:");
        int money = Integer.parseInt(sc.nextLine());
        if (!sacc.withdraw(money)) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        racc.deposit(money);
    }

    void allAccInfo() {
        System.out.println("[전체계좌조회]");
        for (int i = 0; i < cnt; i++) {
            System.out.println(accs[i].info());
        }

    }

}
