//---------------------------------------------------------------------------------------------------------
//
//　メソッドを変数に代入して呼び出す例
//
//---------------------------------------------------------------------------------------------------------
package list6_2;

import java.util.function.IntBinaryOperator;

public class Main {

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {

		// subメソッドの処理ロジックを、変数funcに代入する
		IntBinaryOperator func = Main::sub;

		// 変数funcに格納されている処理ロジックを、引数5と3で実行する
		int a = func.applyAsInt(5, 3);

		System.out.println("5-3は" + a);

	}

}
