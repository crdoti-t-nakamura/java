//---------------------------------------------------------------------------------------------------------
//
//　「Pocket<E>」から裏で作られる「Pocket<String>クラス」
//
//---------------------------------------------------------------------------------------------------------
package list5_6;

public class Main {

	public static void main(String[] args) {

		Pocket<String> p = new Pocket<String>();

		p.put("1192");

		String s = p.get();

		System.out.println(s);

	}

}
