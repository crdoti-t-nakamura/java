//---------------------------------------------------------------------------------------------------------
//
//　Accountクラス
//
//---------------------------------------------------------------------------------------------------------
package list5_8;

enum AccountType {

	FUTSU, TOUZA, TEIKI;

}

// 口座クラスです（朝香ver）
// 【利用例】new Account("1732050", Account.FUTSU);
public class Account {

	private String accountNo;
	private int balance;
	private int accountType;

	public Account(String aNo, int aType) {

		this.accountNo = aNo;
		this.accountType = aType;

	}

	public static final int FUTSU = 1;
	public static final int TOUZA = 2;
	public static final int TEIKI = 3;

}
