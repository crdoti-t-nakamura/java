//---------------------------------------------------------------------------------------------------------
//
//　equals()をオーバーライドしているのにremove()できない
//
//---------------------------------------------------------------------------------------------------------
package list4_4;

import java.util.HashSet;
import java.util.Set;

// Heroクラス
class Hero {

	public String name;
	public boolean equals(Object o) {}

}

// Mainクラス
public class Main {

	// メインメソッド
	public static void main(String[] args) {

		Set<Hero> list =new HashSet<Hero>();
		Hero h1 = new Hero();

		h1.name = "ミナト";
		list.add(h1);

		System.out.println("要素数=" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1);

		System.out.println("要素数=" + list.size());

	}

}
