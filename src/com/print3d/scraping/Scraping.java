package com.print3d.scraping;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Scraping {

	private final static Logger log = Logger.getLogger(Scraping.class);

	public Scraping() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Con esta método compruebo el Status code de la respuesta que recibo al
	 * hacer la petición EJM: 200 OK 300 Multiple Choices 301 Moved Permanently
	 * 305 Use Proxy 400 Bad Request 403 Forbidden 404 Not Found 500 Internal
	 * Server Error 502 Bad Gateway 503 Service Unavailable
	 * 
	 * @param url
	 * @return Status Code
	 * @throws IOException
	 */
	public static int getStatusConnectionCode(String url) throws IOException {

		PropertyConfigurator.configure("C:\\apache-tomcat-8.0.41\\conf\\log4j.properties");
		Response response = null;

		try {
			response = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).ignoreHttpErrors(true).validateTLSCertificates(false).execute();
		} catch (IOException ex) {
			log.info("Error al conectar a:  URL: " + url);
			log.info("ERROR: " + ex.getMessage());
			System.out.println("Excepción al obtener el Status Code: " + ex.getMessage());
			return -1;
		}
		return response.statusCode();
	}

	/**
	 * Con este método devuelvo un objeto de la clase Document con el contenido
	 * del HTML de la web que me permitirá parsearlo con los métodos de la
	 * librelia JSoup
	 * 
	 * @param url
	 * @return Documento con el HTML
	 */
	public static Document getHtmlDocument(String url) {

		Document doc = null;
		try {
			doc = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).validateTLSCertificates(false).get();

		} catch (IOException ex) {
			log.error("Excepción al obtener el HTML de la página" + ex.getMessage());
			System.out.println("Excepción al obtener el HTML de la página" + ex.getMessage());
		}
		return doc;
	}

}
