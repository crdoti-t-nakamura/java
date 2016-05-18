import java.io.*;

public class list15_1 {
	public static void main(String[] args) {
		// FileWriterのコンストラクタは、IOExceptionを発生させる
		// 可能性があります。しかしtry-catchでは囲みません
		// (失敗時にどうするか、考えていない).
		FileWriter fw = new FileWriter("data.txt");
	}
}
