//---------------------------------------------------------------------------------------------------------
//
//
//
//---------------------------------------------------------------------------------------------------------
package list3_5;

import java.util.HashSet;
import java.util.Set;

public class Main {

	// メインメソッド
	public static void main(String[] args) {

		// String型でSetを宣言
		Set<String> colors = new HashSet<String>();

		// add()メソッドで要素を格納
		colors.add("赤");
		colors.add("青");
		colors.add("黄");

		for(String s : colors) {

			System.out.print(s + "→");

		}

	}

}
