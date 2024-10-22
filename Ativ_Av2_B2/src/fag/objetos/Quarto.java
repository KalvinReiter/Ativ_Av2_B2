package fag.objetos;

public class Quarto {

	private int numQuar;
	private String tipoQuar;
	private Double precoDiario;
	private String dispQuar;
	
	public Quarto (int numQuar, String tipoQuar, Double precoDiario, String dispQuar) {
		
		this.numQuar = numQuar;
		this.tipoQuar = tipoQuar;
		this.precoDiario = precoDiario;
		this.dispQuar = dispQuar;
		
	}
	
	public int getNumQuar() {
		
		return numQuar;
		
	}
	
	public void setNumQuar(int numQuar) {
		
		this.numQuar = numQuar;
		
	}
	
	public String getTipoQuar() {
		
		return tipoQuar;
		
	}
	
	public void setTipoQuar(String tipoQuar) {
		
		this.tipoQuar = tipoQuar;
		
	}
	
	public Double getPrecoDiario() {
		
		return precoDiario;
		
	}
	
	public void setPrecoDiario(Double precoDiario) {
		
		this.precoDiario = precoDiario;
		
	}
	
	public String getDispQuar() {
		
		return dispQuar;
		
	}
	
	public void setDispQuar(String dispQuar) {
		
		this.dispQuar = dispQuar;
		
	}
	
	@Override
	public String toString() {
		
		return "Quarto de " + tipoQuar + " cadastrado: \nNúmero: " + numQuar + " \nPreço/dia: " + precoDiario + "\n" + dispQuar;
		
	}
	
	
}
