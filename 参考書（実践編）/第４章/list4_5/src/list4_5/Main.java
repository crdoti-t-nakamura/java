//---------------------------------------------------------------------------------------------------------
//
//　HeroクラスでhashCode()をオーバーライドする
//
//---------------------------------------------------------------------------------------------------------
package list4_5;

import java.util.HashSet;
import java.util.Set;

//Mainクラス
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