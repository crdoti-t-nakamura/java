import java.io.*;

public class list15_3 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		} catch(Exception e) {
			System.out.println("âΩÇÁÇ©ÇÃó·äOÇ™î≠ê∂ÇµÇ‹ÇµÇΩÅB");
		}
	}
}
