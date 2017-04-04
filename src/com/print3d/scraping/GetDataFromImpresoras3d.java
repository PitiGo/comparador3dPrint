package com.print3d.scraping;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.print3d.controller.Print3dHelloWorld;

public class GetDataFromImpresoras3d implements GetDataFromWeb {
	
	
	
	private String url ="https://impresoras3d.com/collections/impresoras3d?page=1";
	private final static Logger log = Logger.getLogger(Print3dHelloWorld.class);
	
	
	

	@Override
	public void getData() {
		
		int status = getStatus();
		
		if(status==200){
			log.info(STATUSOK+url);
			Document html=sc.getHtmlDocument(url);

			 // Buscar todos los precios
	        Elements precios = html.select("p.product-price");
	       // System.out.println("Número de entradas en la página inicial de Jarroba: "+entradas.size()+"\n");
	        
	        for (Element precio : precios) {
	        		System.out.println(precio.text());
	        		
	        }
			//entradas.forEach(action);
	        System.out.println("cantidad de precioes:"+precios.size());
			
			
		}else{
			log.info(STATUSKO+url);
		}
		
		
	
		
	}

	@Override
	public int getStatus() {
		int codigo = 0;
		try {
			codigo = Scraping.getStatusConnectionCode(url);
		} catch (IOException e) {
			System.out.println("ERROR GETING STATUS:"+url);
			e.printStackTrace();
		}
		
		System.out.println("El codigo es:"+codigo);
		
		return codigo;
	}

	

}
