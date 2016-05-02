//---------------------------------------------------------------------------------------------------------
//
//　文字列調査メソッドを利用した例
//
//---------------------------------------------------------------------------------------------------------
package list1_1;

public class Main {

	public static void main(String[] args) {

		// 変数の宣言、代入
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		if(s2.equals(s3)) {

			System.out.println("s2とs3は等しい");

		}

		if(s2.equalsIgnoreCase(s3)) {

			System.out.println("s2とs3はケース区別しなければ等しい");

		}

		System.out.println("s1の長さは" + s1.length() + "です");

	}

}
