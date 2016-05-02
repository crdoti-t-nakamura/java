//---------------------------------------------------------------------------------------------------------
//
//　ブロック外部の変数にアクセスするラムダ式
//
//---------------------------------------------------------------------------------------------------------
package list6_5;

import java.util.function.IntToDoubleFunction;

public class Main {

	public static void main(String[] args) {

		double b = 1.41;

		IntToDoubleFunction func = (x) -> { return x * x * b; };

	}

}
