package list6_3;

// MyFunction型を使えるようにするために
// SAMインタフェースを定義する
public interface MyFunction {
	public abstract int call(int x, int y);
}

// インタフェース名やメソッド名は自由に決めていい
