//---------------------------------------------------------------------------------------------------------
//
//　split()メソッドを使った文字列の分割
//
//---------------------------------------------------------------------------------------------------------
package list1_7;

public class Main {

	public static void main(String[] args) {

		String s = "abc,def:ghi";

		String[] words = s.split("[,:]");

		for(String w : words) {

			System.out.print(w + "->");

		}

	}

}
