package uf4orientacionObjetos;

public class Ex4LaClaseHora {
	
//================ ATRIBUTOS ======================================
	private int hora;
	private int minut;
	private int segundo;
	private static final int HORA_VALIDA = 0;
	
//======================= CONSTRUCTOR ==============================
public Ex4LaClaseHora(int hora, int minut, int segundo) {
		super();
		this.hora = hora;
		this.minut = minut;
		this.segundo = segundo;
	}

//===================== GETTERS Y SETTERS ===========================
	// --> modificadores del atributo hora.
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora >= HORA_VALIDA) {
			this.hora = hora;
		}
	}
	// --> modificadores del atributo minuto.
	public int getMinut() {
		return minut;
	}

	public void setMinut(int minut) {
		if(minut >= HORA_VALIDA) {
			this.minut = minut;
		}
	}
	// --> modificadores del atributo segundo.
	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo >= HORA_VALIDA) {
			this.segundo = segundo;
		}
	}
	
//================= METODOS =========================================
	public void incrementa() {
		setSegundo(getSegundo()+1);
	}
	public void seguent(int numSegundos) {
		setSegundo(getSegundo()+numSegundos);
	}
	public void decrementa() {
		setSegundo(getSegundo()-1);
	}
	public void compareTo(Ex4LaClaseHora hora) {
		
		if(this.getHora()>hora.getHora()) {	
			System.out.println("El this es mas grande tiempo1");			
		}else {
			System.out.println("El parametro es mas grande.");
		}		
	}
	
//==================== MUESTRA RESULTADOS ============================
	@Override
	public String toString() {
		return "La hora es [hora=" + hora + ": minut=" + minut + ": segundo=" + segundo + "]";
	}

	public static void main(String[] args) {
		
		Ex4LaClaseHora tiempo1 = new Ex4LaClaseHora(3,40,0);
		Ex4LaClaseHora tiempo2 = new Ex4LaClaseHora(1, 7, 0);
		
		tiempo1.compareTo(tiempo2);
	
		tiempo1.incrementa();
		tiempo1.seguent(43);
		tiempo1.decrementa();
		
		System.out.println(tiempo1.toString());
		

	}

}
