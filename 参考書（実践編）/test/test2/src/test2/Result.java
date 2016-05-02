package test2;

import java.util.List;

public class Result {

	// 変数の宣言
	private String title;
	private List<Fish> fishList;

	Result() {

		title = "猛毒シリーズ";

		fishList.add(1, new FishName(1, "アオブダイ", "http://crdoti.co.jp/furuya/1.png", "アオブダイ1号", "アオブダイ2号", "アオブダイ3号"));
		fishList.add(2, new Fish(2, "ヒョウモンダコ", "http://crdoti.co.jp/furuya/2.png"));
		fishList.add(3, new FishName(3, "ハナブサイソギンチャク", "http://crdoti.co.jp/furuya/3.png", "はなぶーさ", "いそぎーん", "ちゃっく"));
		fishList.add(4, new FishName(4, "キロネックス", "http://crdoti.co.jp/furuya/4.png", "きろーね", "くす"));
		fishList.add(5, new Fish(5, "アンボイナ", "http://crdoti.co.jp/furuya/5.png"));
		fishList.add(6, new Fish(6, "ウミケムシ", "http://crdoti.co.jp/furuya/6.png"));
		fishList.add(7, new Fish(7, "スベスベマンジュウガニ", "http://crdoti.co.jp/furuya/7.png"));
		fishList.add(8, new Fish(8, "オリーブミナミウミヘビ", "http://crdoti.co.jp/furuya/8.png"));
		fishList.add(9, new Fish(9, "カツオノエボシ", "http://crdoti.co.jp/furuya/9.png"));
		fishList.add(10, new Fish(10, "オニダルマオコゼ", "http://crdoti.co.jp/furuya/10.png"));

	}

}
