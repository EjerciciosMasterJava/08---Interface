package com.sinensia.impresion.imprimible;

public class Pagina implements Imprimible{

	private Integer nPagina;
	
	private Integer nLineas;
	
	public Pagina(Integer nPagina, Integer nLineas) {
		super();
		this.nPagina = nPagina;
		this.nLineas = nLineas;
	}

	@Override
	public void informeLargo() {
		System.out.println("Informe largo de pagina: " + nPagina +" con lineas: " + nLineas);
	}

	@Override
	public void informecorto() {
		System.out.println("Informe corto de pagina: " + nPagina);
	}

	@Override
	public String toString() {
		return "Pagina [nPagina=" + nPagina + ", nLineas=" + nLineas + "]";
	}


}
