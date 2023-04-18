package ejercicio12;

import java.util.ArrayList;

import ejercicio12.personas.Persona;
import ejercicio12.personas.PersonaConOS;

public class Dia {
	private static final int CANT_TESTS = 3;
	private static final String MENSAJE = "No hay cupos para hoy";
	private String fecha;
    private boolean esHabil;
    private ArrayList<Persona> personas;
    

    public Dia(int numDia) {
    	this.fecha = "0" + numDia + "/00/0000";
        personas = new ArrayList<Persona>();        
    }

    public void agregarPersona(Persona p) {
        personas.add(p);
    }

	public int getCantInscriptos() {
		return personas.size();
	}

	/**
	 * Revisa si hay test suficientes, notifica a quienes quedan fuera y devuelve tal cantidad
	 * @return el número de personas sobrantes (que quedaron fuera)
	 */
	public int revisar() {
		int sobrantes = 0;
		
		if (getCantInscriptos() > CANT_TESTS) {			
			sobrantes = getCantInscriptos() - CANT_TESTS;
			notificar();
		}		
		
		return sobrantes;
	}
	
	public void notificar() {
		for (int i = CANT_TESTS; i < getCantInscriptos(); i++) {
			personas.get(i).notificar(MENSAJE);			
		}
	}

	public String getFecha() {
		return fecha;
	}

	public int getCantPersonasConPrioridad(int prioridad) {
		int cant = 0;
		for (Persona persona : personas) {
			System.out.println(persona.getClass().getSimpleName());
			if (persona.getPrioridad() == prioridad) {
				cant++;
			}
		}
		return cant;
	}
	
    public double promedioEdadPersonasSinOS() {
    	int acuEdades = 0;
    	int cont = 0;
    	
    	for (Persona persona : personas) {
    		// if ( persona.getClass().getSimpleName().equals("Persona") )
    		if ( !(persona instanceof PersonaConOS) ) {
    			acuEdades += persona.getEdad();
    			cont++;
    		}
		}
    	return cont > 0 ? acuEdades * 1.0 / cont : 0;
    	
    }
    

    /*public void mostrarInfo() {
        // Mostrar fecha y si es día hábil o no
        System.out.println("Fecha: " + fecha);
        System.out.println("Día hábil: " + esHabil);

        // Mostrar información de cada persona
        for (Persona p : personas) {
            System.out.println("- DNI: " + p.getDni());
            System.out.println("  Nombre: " + p.getNombre() + " " + p.getApellido());
            System.out.println("  Edad: " + p.getEdad());
            System.out.println("  Motivo del testeo: " + p.getMotivoTesteo());
            if (p.getObraSocial() != null && p.getNumAfiliado() != null) {
                System.out.println("  Obra social: " + p.getObraSocial());
                System.out.println("  Número de afiliado: " + p.getNumAfiliado());
            }
        }
    }*/
}
