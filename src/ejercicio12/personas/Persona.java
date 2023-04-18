package ejercicio12.personas;

import ejercicio12.Motivo;
import ejercicio12.Notificable;
import ejercicio12.Priorizable;

public class Persona implements Notificable, Priorizable {
	
	private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Motivo motivoTesteo;

    public Persona(String dni, String nombre, String apellido, int edad, Motivo motivoTesteo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.motivoTesteo = motivoTesteo;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("NOTIFICANDO A " + nombreCompleto() + ": " + mensaje);
    }

	private String nombreCompleto() {
		// TODO Auto-generated method stub
		return nombre + " " + apellido;
	}

	@Override
	public int getPrioridad() {
		return PRIORIDAD_MAX;
	}

	public int getEdad() {
		return edad;
	}
	
	protected Motivo getMotivoTesteo() {
		return motivoTesteo;
	}	

}
