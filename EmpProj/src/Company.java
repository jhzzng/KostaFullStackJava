
public class Company {
	Employee[] emps = new Employee[100];
	int cnt = 0;

//여기부터
	void enter(Employee emp) {
		emps[cnt++] = emp;
	}

	void allEmpInfo() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(emps[i].info());
		}
	}

	Employee name(String id) {
		Employee emp = null;
		for (int i = 0; i < cnt; i++) {
			if (emps[i].id.equals(id)) {
				emp = emps[i];
				break;
			}
		}
		return emp;
	}
//
//	void setPay(String num, int pay) {
//		Employee emp = name(num);
//		if(emp == null) {
//			System.out.println("사번이 틀립니다.")
//			return;
//		}
//		emp.setPay(pay);
//	}
//
//	void bonus(Employee emp) {
//		
//		if()
//	}

//여기 없었음 너가 작성해봐야해

	public static void main(String args) {
		Company com = new Company();

//		com.enter(new Employee("1001", "홍길동", 100000));
//		com.enter(new Employee("1002", "박길동", 200000));
//		com.enter(new Employee("1003", "김길동", 300000));
		com.enter(new Employee("홍길동", 100000));
		com.enter(new Employee("박길동", 200000));
		com.enter(new Employee("김길동", 300000));

//
//		com.setPay("1001", 1000000);
//		com.bonus("1002", 500000);

		com.allEmpInfo();

	}
}
