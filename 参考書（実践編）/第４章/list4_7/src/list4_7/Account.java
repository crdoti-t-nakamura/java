//---------------------------------------------------------------------------------------------------------
//
//　Accountクラス
//
//---------------------------------------------------------------------------------------------------------
package list4_7;

public class Account implements Comparable<Account> {

	// 口座番号（先頭に空白が入ることもある）
	int number;

	public int compareTo(Account obj) {

		if(this.number < obj.number) {

			return -1;

		}
		if(this.number > obj.number) {

			return 1;

		}

		return 0;

	}


}