import java.io.*;

public class list15_1 {
	public static void main(String[] args) {
		// FileWriter�̃R���X�g���N�^�́AIOException�𔭐�������
		// �\��������܂��B������try-catch�ł͈݂͂܂���
		// (���s���ɂǂ����邩�A�l���Ă��Ȃ�).
		FileWriter fw = new FileWriter("data.txt");
	}
}
