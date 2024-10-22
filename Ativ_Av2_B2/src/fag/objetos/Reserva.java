package fag.objetos;

public class Reserva {

	private String nomeHospede;
	private String checkIn;
	private String checkOut;
	private int numReservados;
	private String tipoReservado;
	
	public Reserva (String nomeHospede, String checkIn, String checkOut, int numReservados, String tipoReservado) {
		
		this.nomeHospede = nomeHospede;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numReservados = numReservados;
		this.tipoReservado = tipoReservado;
		
	}
	
	public String getNomeHospede() {
		return nomeHospede;
	}
	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public int getNumReservados() {
		return numReservados;
	}
	public void setNumReservados(int numReservados) {
		this.numReservados = numReservados;
	}
	public String getTipoReservado() {
		return tipoReservado;
	}
	public void setTipoReservado(String tipoReservado) {
		this.tipoReservado = tipoReservado;
	}
	
	@Override
	public String toString() {
		
		return "Reserva de " + numReservados + " quarto(s) " + tipoReservado+ "(s)  cadastrada: \nPrimeiro nome: " + nomeHospede + " \nDia de check-in: " + checkIn + "\nDia de check-out: " + checkOut;
		
	}
	

	
}
