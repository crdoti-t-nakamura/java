package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	// メインメソッド
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();

		// リストに格納
		list1.add("雷門");
		list1.add("スカイツリー");
		list1.add("築地");

		List<String> list2 = new ArrayList<String>();

		// リストに格納
		list2.add("雷おこし");
		list2.add("つくだ煮");


		Map<List, List> place = new HashMap<List, List>();
	}

}
