//---------------------------------------------------------------------------------------------------------
//
//　関数格納用のインタフェースを宣言して利用する
//
//---------------------------------------------------------------------------------------------------------
package list6_3;


public class Main {

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {

		// subメソッドの処理ロジックを、変数funcに代入する
		MyFunction func = Main::sub;

		// 変数funcに格納されている処理ロジックを、引数5と3で実行する
		int a = func.call(5, 3);

		System.out.println("5-3は" + a);

	}

}
