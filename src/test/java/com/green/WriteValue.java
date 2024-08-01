package com.green;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Address;
import com.pojo.Company;
import com.pojo.WriteValue_pojo1;

public class WriteValue {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File file = new File(
				"C:\\Users\\SCLPT 059\\eclipse-workspace\\ApiAutomationNewProject\\src\\test\\resources\\WriteValue.json");

		ObjectMapper mapper = new ObjectMapper();

		Company company = new Company("manivasagam", 91234);
		Address address = new Address("thrapurathanur", "karur", "tamilnadu");
		Address address1 = new Address("kovakulam", "karur", "tamilnadu");
		Address address2 = new Address("krishnarayapuram", "karur", "tamilnadu");
		ArrayList<Address> arrayList = new ArrayList<Address>();
		arrayList.add(address);
		arrayList.add(address1);
		arrayList.add(address2);

		WriteValue_pojo1 pojo1 = new WriteValue_pojo1("mani", 912353597, 3456, arrayList, company);
		mapper.writeValue(file, pojo1);

	}

}
