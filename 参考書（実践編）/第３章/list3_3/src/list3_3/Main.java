//---------------------------------------------------------------------------------------------------------
//
//
//
//---------------------------------------------------------------------------------------------------------
package list3_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	// メインメソッド
	public static void main(String[] args) {

		// String型でArrayListを宣言
		ArrayList<String> names = new ArrayList<String>();

		// 自動的にStringに変換・格納される
		names.add("湊");
		names.add("朝香");
		names.add("菅原");

		// イテレータの取得
		Iterator<String> it = names.iterator();

		// 矢印を次に進められるなら繰り返す
		while(it.hasNext()) {

			// 矢印を次に進め、内容を取り出す
			String e = it.next();
			System.out.println(e);

		}

	}

}
