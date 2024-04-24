package com.sinensia.impresion.aplicacion;

import java.util.Arrays;
import java.util.List;

import com.sinensia.impresion.imprimible.Imprenta;
import com.sinensia.impresion.imprimible.Imprimible;
import com.sinensia.impresion.util.UtilImprimible;

public class AplicacionImpresion {

	public static void main(String[] args) {

		Imprenta imprenta = new Imprenta("Imprenta");
		
		imprenta.setImprimibles(UtilImprimible.getListaPorDefecto());
		
		imprenta.getImprimibles().forEach(i -> {
			i.informecorto();
			i.informeLargo();
		});
		
	}

}
