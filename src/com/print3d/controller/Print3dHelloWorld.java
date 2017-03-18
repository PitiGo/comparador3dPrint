package com.print3d.controller;
 

import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.print3d.scraping.Scraping;

/*
 * 
 * author: Crunchify.com
 * 
 */
 
@Controller
public class Print3dHelloWorld {
 
	private final static Logger log = Logger.getLogger(Print3dHelloWorld.class);
	private static final String STATUSOK="Conection status:OK -->";
	private static final String STATUSKO="Conection status:KO -->";
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() throws IOException{
		
		Scraping sc = new Scraping();
		String url ="https://impresoras3d.com/collections/impresoras3d?page=1";

		int codigo = sc.getStatusConnectionCode(url);
		
		if(codigo==200){
			log.info(STATUSOK+url);
			Document html=sc.getHtmlDocument(url);
			
			
			System.out.println("despues de coger productos");
//			
			
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
		
		System.out.println("El codigo es:"+codigo);
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}