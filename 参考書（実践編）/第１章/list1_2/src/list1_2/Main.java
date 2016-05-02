//---------------------------------------------------------------------------------------------------------
//
//　文字列検索メソッドを利用した例
//
//---------------------------------------------------------------------------------------------------------
package list1_2;

public class Main {

	public static void main(String[] args) {

		// 変数の宣言、代入
		String s1 = "Java and JavaScript";

		if(s1.contains("Java")) {

			System.out.println("文字列s1は、Javaを含んでいます");

		}

		if(s1.endsWith("Java")) {

			System.out.println("文字列s1は、Javaが末尾にあります");

		}

		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

	}

}
