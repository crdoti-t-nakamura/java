//---------------------------------------------------------------------------------------------------------
//
//　equals()オーバーライドをサボったHeroをコレクションに入れる
//
//---------------------------------------------------------------------------------------------------------
package list4_3;

import java.util.ArrayList;
import java.util.List;

// Heroクラス
class Hero {

	public String name;

}

// メインクラス
public class Main {

	// メインメソッド
	public static void main(String[] args) {

		// Hero型のlistを生成
		List<Hero> list = new ArrayList<Hero>();

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
