package com.print3d.persistencia;

import java.io.Serializable;

public class Data_web_printer implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private long iddatawebPrinter;
		private String dataPrice;
		private String dataTitle;
		private int idImpresora;
		
		public  Data_web_printer(String dataTitle,String dataPrice,int idImpresora){
			this.dataTitle = dataTitle;
			this.dataPrice = dataPrice;
			this.idImpresora = idImpresora;

		}
		
		public long getIddatawebPrinter() {
			return iddatawebPrinter;
		}

		public void setIddatawebPrinter(long iddatawebPrinter) {
			this.iddatawebPrinter = iddatawebPrinter;
		}

		public String getDataPrice() {
			return dataPrice;
		}

		public void setDataPrice(String dataPrice) {
			this.dataPrice = dataPrice;
		}

		public String getDataTitle() {
			return dataTitle;
		}

		public void setDataTitle(String dataTitle) {
			this.dataTitle = dataTitle;
		}

		public int getIdImpresora() {
			return idImpresora;
		}

		public void setIdImpresora(int idImpresora) {
			this.idImpresora = idImpresora;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		
		

		
		
		
		
		

}
