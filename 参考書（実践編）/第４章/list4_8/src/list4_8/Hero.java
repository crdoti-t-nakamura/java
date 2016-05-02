//---------------------------------------------------------------------------------------------------------
//
//　Heroクラス
//
//---------------------------------------------------------------------------------------------------------
package list4_8;

public class Hero {

	String name;
	int hp;
	Sword sword;

	Hero(String name) {

		this.name = name;

	}
	Hero() {
		this.name = null;
		this.hp = 0;
		this.sword = new Sword();
	}

	public Hero clone() {

		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;

	}

}
