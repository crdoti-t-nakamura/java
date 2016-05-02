//---------------------------------------------------------------------------------------------------------
//
//　replaceAll()メソッドを使った文字列の置換
//
//---------------------------------------------------------------------------------------------------------
package list1_8;

public class Main {

	public static void main(String[] args) {

		String s = "abc,def:ghi";

		String w = s.replaceAll("[beh]", "X");

		System.out.println(w);

	}

}
