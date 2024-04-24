package com.sinensia.impresion.imprimible;

public class Factura implements Imprimible{

	private Long nFactura;
	
	private Long codigoCliente;
	
	
	public Factura(Long nFactura, Long codigoCliente) {
		super();
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}

	@Override
	public void informeLargo() {
		System.out.println("Informe largo de factura: " + nFactura +" con codigo de cliente: " +codigoCliente);
	}

	@Override
	public void informecorto() {
		System.out.println("Informe corto de factura: " + nFactura);
	}

	@Override
	public String toString() {
		return "Factura [nFactura=" + nFactura + ", codigoCliente=" + codigoCliente + "]";
	}

}
