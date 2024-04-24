package com.sinensia.impresion.imprimible;

import java.util.List;

public class Imprenta {

	private String nombreImprenta;
	
	List<Imprimible> imprimibles;
	
	public Imprenta(String nombreImprenta) {
		super();
		this.nombreImprenta = nombreImprenta;
	}
	
	public String getNombreImprenta() {
		return nombreImprenta;
	}
	public void setNombreImprenta(String nombreImprenta) {
		this.nombreImprenta = nombreImprenta;
	}
	public List<Imprimible> getImprimibles() {
		return imprimibles;
	}
	public void setImprimibles(List<Imprimible> imprimibles) {
		this.imprimibles = imprimibles;
	}

	@Override
	public String toString() {
		return "Imprenta [nombreImprenta=" + nombreImprenta + ", imprimibles=" + imprimibles + "]";
	}
	
}
