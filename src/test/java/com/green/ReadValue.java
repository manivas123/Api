package com.green;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadValue {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		FileReader reader=new FileReader("src\\test\\resources\\FileName.json");
		
		JSONParser jsonParser=new JSONParser();
		
		Object object = jsonParser.parse(reader);
		
		JSONObject jsonObject=(JSONObject)object;
		Object object5 = jsonObject.get("total");
		System.out.println(object5);
		
		Object object2 = jsonObject.get("data");
//		System.out.println(object2);
		
		JSONArray array=(JSONArray)object2;
		for (int i = 0; i < array.size(); i++) {
		Object object3 = array.get(i);
//		System.out.println(object3);
	

		JSONObject jsonObject2=(JSONObject)object3;
		Object object4 = jsonObject2.get("flightName");
//		System.out.println(object4);
		
		}
	}
	
	
	
}
