package com.sinensia.impresion.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.sinensia.impresion.imprimible.Factura;
import com.sinensia.impresion.imprimible.Imprimible;
import com.sinensia.impresion.imprimible.Pagina;

public class UtilImprimible {

	public static List<Imprimible> getListaPorDefecto(){
		return Arrays.asList(
						new Imprimible[] { 
								new Factura(111L, 1L), 
								new Pagina(20, 200) 
								}
						);
	}
	
	public static List<Imprimible> getListaImprimiblePorCantidad(Integer numFacturas, Integer NumFactura){
		List<Imprimible> lista = new ArrayList<Imprimible>();
		lista.addAll(getListaImprimibleFactura(numFacturas));
		lista.addAll(getListaImprimiblePaginas(NumFactura));
		return lista;
	}
	
	public static List<Imprimible> getListaImprimibleFactura(Integer numFacturas){
		List<Imprimible> facturas = new ArrayList();
		if(numFacturas > 0) {
			for (Integer i = 0; i < numFacturas; i++) {
				facturas.add(new Factura(i.longValue(),i.longValue()));
			}
		}
		return facturas;
	}
	
	public static List<Imprimible> getListaImprimiblePaginas(Integer numPaginas){
		List<Imprimible> paginas = new ArrayList();
		if(numPaginas > 0) {
			for (Integer i = 0; i < numPaginas; i++) {
				paginas.add(new Pagina(i,i));
			}
		}
		return paginas;
	}
	
}
