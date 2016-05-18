import java.io.*;

public class list15_4 {
	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch(IOException e) {
			System.out.println("ÉGÉâÅ[Ç≈Ç∑");
		}
		fw.close();
	}
}
