//------------------------------------------------------------------------------
//
//　月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。
//　2 月は 28 日とします。また、1 〜 12 以外の数値が入力された場合に、
//　“入力が間違っています”と表示しなさい。
//
//------------------------------------------------------------------------------

public class rensyu3_13 {

	public static void main(String[] args){
		// 変数の宣言
		int month;

		// 入力
		System.out.print("月を入力 ＞ ");
		month = new java.util.Scanner(System.in).nextInt();

		switch(month){
			case 1:
				System.out.println("３１日");
				break;

			case 2:
				System.out.println("２８日");
				break;

			case 3:
				System.out.println("３１日");
				break;

			case 4:
				System.out.println("３０日");
				break;

			case 5:
				System.out.println("３１日");
				break;

			case 6:
				System.out.println("３０日");
				break;

			case 7:
				System.out.println("３１日");
				break;

			case 8:
				System.out.println("３１日");
				break;

			case 9:
				System.out.println("３０日");
				break;

			case 10:
				System.out.println("３１日");
				break;

			case 11:
				System.out.println("３０日");
				break;

			case 12:
				System.out.println("３１日");
				break;

			default:
				System.out.println("入力が間違っています。");
		}
	}
}
