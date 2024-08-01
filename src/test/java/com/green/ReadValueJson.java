package com.green;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.ReadValue_pojo_class;
import com.pojo.ReadValue_pojo_classDatum;
import com.pojo.ReadValue_pojo_classSupport;

public class ReadValueJson {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		
		File file=new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\ApiAutomationNewProject\\src\\test\\resources\\FileName.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		ReadValue_pojo_class value = mapper.readValue(file,ReadValue_pojo_class.class );
		
		int per_page = value.getPer_page();
		System.out.println(per_page);
		
		ArrayList<ReadValue_pojo_classDatum> data = value.getData();
         for (ReadValue_pojo_classDatum readValue_pojo_classDatum : data) {
        System.out.println(readValue_pojo_classDatum.getId());	 
        	  
		}	
         ReadValue_pojo_classSupport support = value.getSupport();
         String text = support.getText();
		System.out.println(text);
	}
	
	
}
