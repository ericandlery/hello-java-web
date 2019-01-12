package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;

public class TestGson {

	@Test
	public void test() {
		
		String s="select 1 from dual;";
		
		Map<String,Object> map=new HashMap<>();
		map.put("name","Kimi");
		map.put("team","McLaren");
		
		System.out.println(new Gson().toJson(map));
		
	}

}
