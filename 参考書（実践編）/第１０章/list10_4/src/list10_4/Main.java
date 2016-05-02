package list10_4;

//import java.io.FileInputStream;
import java.io.FileReader;
//import java.io.ObjectInputStream;
import java.io.Reader;
import java.util.Properties;


public class Main {

	// メインメソッド
	public static void main(String[] args) throws Exception {

		Reader fr = new FileReader("c:\\rpgdata.properties");

		Properties p = new Properties();

		p.load(fr);


	//	FileInputStream fis = new FileInputStream("c:\\rpgsave.dat");
	//	ObjectInputStream ois = new ObjectInputStream(fis);

	}

}
