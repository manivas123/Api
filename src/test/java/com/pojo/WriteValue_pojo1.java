package com.pojo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WriteValue_pojo1 {

	private String name;
	private long phoneNo;
	private int id;
	private ArrayList<Address> address;
	private Company company;

}
