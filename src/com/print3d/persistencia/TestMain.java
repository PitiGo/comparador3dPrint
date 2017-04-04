package com.print3d.persistencia;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.print3d.persistencia.conf.SessionManager;

public class TestMain {

	public static void main(String[] args) {
		
		Printer printer = new Printer("impresora56565","descripcion5656");
		Data_web_printer dwp = new Data_web_printer("impresoraOnline1", "123", 1);
		
		Session session = SessionManager.getSession();
		
		Transaction tx = session.beginTransaction();
		session.save(printer);
		session.save(dwp);
		tx.commit();
		session.close();
		System.out.println("jo");

	}

}
