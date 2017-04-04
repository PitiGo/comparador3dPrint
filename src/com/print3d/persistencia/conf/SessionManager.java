package com.print3d.persistencia.conf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public abstract class SessionManager {
	
	private static SessionFactory sessionFactory;

	public static Session getSession() throws HibernateException{
		
		// Instancia un objeto del tipo Configuration
		Configuration config = new Configuration();

		// Registra las clases a mapear en la configuracion
		registerMappers(config);
		
		Properties prop = new Properties();
		
		try {
		//	Properties prop = new Properties();
			FileInputStream fi = new FileInputStream("src/com/print3d/persistencia/conf/hibernate.properties");
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// // Establece las propiedades de configuracion
		config.setProperties(prop);
		//
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings( config.getProperties()). buildServiceRegistry();
	    sessionFactory = config.buildSessionFactory(serviceRegistry);
		
		// // Retorna una sesion de trabajo
	    return sessionFactory.openSession();

	}



	// Cada clase mapeada deberá aparecer aca.
	private static void registerMappers(Configuration config) throws MappingException {
		config.addResource("com/print3d/persistencia/conf/printer.hbm.xml");
		config.addResource("com/print3d/persistencia/conf/data_web_printer.hbm.xml");
	}

}
