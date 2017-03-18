package com.print3d.controller;
 

import java.io.IOException;

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
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() throws IOException{
		
		Scraping sc = new Scraping();

		int codigo = sc.getStatusConnectionCode("https://jarroba.com/scraping-java-jsoup-ejemplos/");
		
		System.out.println("El codigo es:"+codigo);
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}