package test1;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {

	// メインメソッド
	public static void main(String[] args) throws IOException {

		Result result = new Result();

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		result.result();

		String json = mapper.writeValueAsString(result);
		System.out.println(json);

	}

}
