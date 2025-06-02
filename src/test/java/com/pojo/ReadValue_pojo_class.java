package com.pojo;


import java.util.ArrayList;

public class ReadValue_pojo_class {

	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<ReadValue_pojo_classDatum> data;
	private ReadValue_pojo_classSupport support;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public ArrayList<ReadValue_pojo_classDatum> getData() {
		return data;
	}
	public void setData(ArrayList<ReadValue_pojo_classDatum> data) {
		this.data = data;
	}
	public ReadValue_pojo_classSupport getSupport() {
		return support;
	}
	public void setSupport(ReadValue_pojo_classSupport support) {
		this.support = support;
	}

	
	
	
	
	
}
