package list10_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

	// メインメソッド
	public void saveHeroToFile(Hero h) throws IOException {

		Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));

		w.write(h.name + "\n");

		w.write(h.hp + "\n");

		w.write(h.mp + "\n");

		w.flush();

		w.close();

	}

}
