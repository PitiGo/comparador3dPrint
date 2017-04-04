package com.print3d.scraping;

public interface GetDataFromWeb {
	
	static final String STATUSOK="Conection status:OK -->";
	static final String STATUSKO="Conection status:KO -->";
	
	//ArrayList<String> urls=new ArrayList<String>();
	
	String url="";
	
	Scraping sc = new Scraping();
	
	public void getData();
	
	public int getStatus();

}
