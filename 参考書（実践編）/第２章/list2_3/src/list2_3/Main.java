//---------------------------------------------------------------------------------------------------------
//
//　LocalDateTimeの利用例
//
//---------------------------------------------------------------------------------------------------------
package list2_3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {

		// LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);

		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();

		System.out.println("ロンドン：" + l3.getYear() + l3.getMonth() + l3.getDayOfMonth());

	}

}
