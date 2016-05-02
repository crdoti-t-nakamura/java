//---------------------------------------------------------------------------------------------------------
//
//　Accountクラス（湊ver.）
//
//---------------------------------------------------------------------------------------------------------
package list5_7;

// 口座クラスです（湊ver）
// 【利用例】new Account("1732050", 普通);
public class Account {

	private String accountNo;
	private int balance;
	private String accountType;

	public Account(String aNo, String aType) {

		this.accountNo = aNo;
		this.accountType = aType;

	}

}
