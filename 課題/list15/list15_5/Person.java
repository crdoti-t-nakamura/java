import java.io.*;

public class Person {

	int age;

	public void setAge(int age) {
		if(age < 0) {				// �����ň������`�F�b�N
			throw new IllegalArgumentException
				("�N��͐��̐����w�肷�ׂ��ł��B�w��l=" + age);
		}
		this.age = age;				// ���Ȃ��Ȃ�A�t�B�[���h�ɒl���Z�b�g
	}
}
