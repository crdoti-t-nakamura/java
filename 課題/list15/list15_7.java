import java.io.*;

public class list15_7 {
	public static void main(Strign[] args) {

		try {
			throw new UnspportedMusicFileException
			("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
