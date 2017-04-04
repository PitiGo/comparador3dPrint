package com.print3d.persistencia;

import java.io.Serializable;

public class Printer implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private long idPrinter;
		private String printerName;
		private String printerDesc;
		
		public  Printer(String name,String desc){
			this.printerName = name;
			this.printerDesc = desc;
		}
		

		public long getIdPrinter() {
			return idPrinter;
		}


		public void setIdPrinter(long idPrinter) {
			this.idPrinter = idPrinter;
		}


		public String getPrinterName() {
			return printerName;
		}


		public void setPrinterName(String printerName) {
			this.printerName = printerName;
		}


		public String getPrinterDesc() {
			return printerDesc;
		}


		public void setPrinterDesc(String printerDesc) {
			this.printerDesc = printerDesc;
		}


		
		
		
		
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		
		

}
