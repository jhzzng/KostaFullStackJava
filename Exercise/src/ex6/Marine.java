package ex6;

class Marine {
	int x = 0, y = 0;
	int hp = 60;
//Marine의 위치좌표(x,y)
// 현재 체력
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력

	void weaponUp() {
		weapon++;
	}

	void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
