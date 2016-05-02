//---------------------------------------------------------------------------------------------------------
//
//
//
//---------------------------------------------------------------------------------------------------------
package list3_9;

import java.util.ArrayList;
import java.util.List;

/** Heroクラス */
class Hero {

	/** 変数name
	 * <p>
	 * 各ネームを入力する */
	public String name;
}

public class Main {

	// メインメソッド
	public static void main(String[] args) {

		// Heroをインスタンス
		Hero h = new Hero();

		h.name = "ミナト";

		List<Hero> list = new ArrayList<Hero>();

		// hをリストに格納
		list.add(h);

		// 格納後にhを書き換え
		h.name = "スガワラ";

		System.out.println(list.get(0).name);

	}

}
