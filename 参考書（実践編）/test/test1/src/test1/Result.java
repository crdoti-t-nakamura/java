package test1;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Result {

	private String title;
	private Fish fishList[];

	Result() {

		this.title = "猛毒シリーズ";

		fishList = new Fish[10];
		fishList[0] = new Fish( 1, "アオブダイ", "http://crdoti.co.jp/furuya/1.png");
		fishList[1] = new Fish( 2, "ヒョウモンダコ", "http://crdoti.co.jp/furuya/2.png");
		fishList[2] = new Fish( 3, "ハナブサイソギンチャク", "http://crdoti.co.jp/furuya/3.png");
		fishList[3] = new Fish( 4, "キロネックス", "http://crdoti.co.jp/furuya/4.png");
		fishList[4] = new Fish( 5, "アンボイナ", "http://crdoti.co.jp/furuya/5.png");
		fishList[5] = new Fish( 6, "ウミケムシ", "http://crdoti.co.jp/furuya/6.png");
		fishList[6] = new Fish( 7, "スベスベマンジュウガニ", "http://crdoti.co.jp/furuya/7.png");
		fishList[7] = new Fish( 8, "オリーブミナミウミヘビ", "http://crdoti.co.jp/furuya/8.png");
		fishList[8] = new Fish( 9, "カツオノエボシ", "http://crdoti.co.jp/furuya/9.png");
		fishList[9] = new Fish(10, "オニダルマオコゼ", "http://crdoti.co.jp/furuya/10.png");
		
	}

	public void result() throws IOException {

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		String json[] = new String[10];

		for(int i = 0; i < 10; i++) {
			json[i] = mapper.writeValueAsString(fishList[i]);
			System.out.println(json[i]);
		}

	}

}
