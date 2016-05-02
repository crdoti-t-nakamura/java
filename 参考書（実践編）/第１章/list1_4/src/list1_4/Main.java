//---------------------------------------------------------------------------------------------------------
//
//　StringBuilderを利用し文字列を１万回連結する
//
//---------------------------------------------------------------------------------------------------------
package list1_4;

public class Main {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < 10000; i++) {

			sb.append("Java");

		}

		String s = sb.toString();

//		System.out.println(s);

	}

}
