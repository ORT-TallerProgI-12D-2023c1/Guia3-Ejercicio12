package ejercicio12.personas;

import ejercicio12.Motivo;

public class PersonaConOS extends Persona {

	private String nroAFiliado;
	private String nombreOS;
	
	public PersonaConOS(String dni, String nombre, String apellido, int edad, Motivo motivoTesteo, String nroAFiliado,
			String nombreOS) {
		super(dni, nombre, apellido, edad, motivoTesteo);
		this.nroAFiliado = nroAFiliado;
		this.nombreOS = nombreOS;
	}
	
	@Override
	public int getPrioridad() {
		int prioridad = PRIORIDAD_MIN;
		if (getEdad() >= 60 || getMotivoTesteo() == Motivo.CONTACTO_ESTRECHO) {
			prioridad = PRIORIDAD_MAX;
		}
		return prioridad;
	}
	
}
