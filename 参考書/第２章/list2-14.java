//------------------------------------------
//
//　ランダムな数を生成する命令
//
//------------------------------------------

public class list2-14 {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
	}
}
