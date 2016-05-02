//---------------------------------------------------------------------------------------------------------
//
//　関数をその場で生み出し、代入し、呼び出す
//
//---------------------------------------------------------------------------------------------------------
package list6_4;

import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {

		// 「2つの引数の差を求める処理」の実体を生み出し、代入する
		IntBinaryOperator func = (int a, int b) -> { return a - b; };

		int a = func.applyAsInt(5, 3);

		System.out.println("5-3は" + a);

	}

}
