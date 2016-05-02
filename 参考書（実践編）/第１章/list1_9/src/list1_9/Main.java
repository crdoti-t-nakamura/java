//---------------------------------------------------------------------------------------------------------
//
//　キャラクター状態１人分の表示のためのコード
//
//---------------------------------------------------------------------------------------------------------
package list1_9;

public class Main {

	public static void main(String[] args) {

		Hero hero = new Hero("minato", "hero", 280);

		final String FORMAT = "%8s %6s 所持金%,5d";

		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());

		System.out.println(s);

	}
}
