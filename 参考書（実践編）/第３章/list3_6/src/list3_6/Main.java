//---------------------------------------------------------------------------------------------------------
//
//
//
//---------------------------------------------------------------------------------------------------------
package list3_6;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	// メインメソッド
	public static void main(String[] args) {

		// String型でSetを宣言
		Set<String> words = new TreeSet<String>();

		// add()メソッドで要素を格納
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");

		for(String s : words) {

			System.out.print(s + "→");

		}

	}

}
