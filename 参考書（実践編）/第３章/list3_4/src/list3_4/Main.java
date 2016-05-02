//---------------------------------------------------------------------------------------------------------
//
//
//
//---------------------------------------------------------------------------------------------------------
package list3_4;

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
		colors.add("赤");

		// 要素数を出力
		System.out.println("色は" + colors.size() + "種類");

	}

}
