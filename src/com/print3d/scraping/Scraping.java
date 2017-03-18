package com.print3d.scraping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.http.HttpMethod;

public class Scraping {

	public Scraping() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Con esta método compruebo el Status code de la respuesta que recibo al
	 * hacer la petición EJM: 
	 * 200 OK 
	 * 300 Multiple Choices 
	 * 301 Moved Permanently
	 * 305 Use Proxy 
	 * 400 Bad Request 
	 * 403 Forbidden 
	 * 404 Not Found 
	 * 500 Internal Server Error 
	 * 502 Bad Gateway 
	 * 503 Service Unavailable
	 * 
	 * @param url
	 * @return Status Code
	 * @throws IOException 
	 */
	public static int getStatusConnectionCode(String url) throws IOException {


		System.out.println("Antes de conectar");
//		System.setProperty("http.proxyHost", "10.110.8.100");
//		System.setProperty("http.proxyPort", "8080");
//		HttpClient client = new DefaultHttpClient();
//		HttpGet request = new HttpGet("http://www.vogella.com");
//		HttpResponse response = client.execute(request);
		
		
		// Get the response
//		BufferedReader rd = new BufferedReader
//		        (new InputStreamReader(
//		        response.getEntity().getContent()));
//
//		String line = "";
//		PrintStream textView = null;
//		
//		while ((line = rd.readLine()) != null) {
//		       
//				textView.append(line);
//		}
		
		System.out.println("out");
//		System.setProperty("http.proxyHost", "10.110.8.100");
//        System.setProperty("http.proxyPort", "8080");
//
//        String proxy=System.getProperty("http.proxyHost");
//        System.out.println("proxy:"+proxy);
//        Document doc = Jsoup.connect("http://stackoverflow.com").timeout(300000).get();
//        System.out.println("Obtained Title: " + doc.title());
		
		return 200;
	}

}
