package ejercicio12;

import ejercicio12.personas.Persona;
import ejercicio12.personas.PersonaConOS;

public class Test {

	public static void main(String[] args) {
		
		CentroDeTesteo centro = new CentroDeTesteo();
				
		centro.agregarPersonaADia( new Persona("123", "Pepe", "Pompin", 23, Motivo.CONTACTO_ESTRECHO), 1 );
		centro.agregarPersonaADia( new Persona("124", "Augusto", "Messi", 40, Motivo.VIAJE), 1 );
		centro.agregarPersonaADia( new PersonaConOS("129", "Luis", "Palermo", 40, Motivo.VIAJE, "234243", "OSDE"), 1 );
		centro.agregarPersonaADia( new Persona("125", "Pedro", "Dibu", 67, Motivo.REPETICION_POR_ERROR), 1 );
		centro.agregarPersonaADia( new Persona("126", "Maria", "Di Maria", 70, Motivo.VIAJE), 2 );
		centro.agregarPersonaADia( new PersonaConOS("129", "Sara", "Paredes", 70, Motivo.VIAJE, "234243", "OSDE"), 2 );
		centro.agregarPersonaADia( new Persona("127", "Pablo", "Tagliafico", 23, Motivo.REPETICION_POR_ERROR), 3 );
		centro.agregarPersonaADia( new Persona("128", "Juan", "Montiel", 56, Motivo.CONTACTO_ESTRECHO), 3 );
		centro.agregarPersonaADia( new Persona("129", "Ana", "Córdoba", 14, Motivo.VIAJE), 3 );	
		centro.agregarPersonaADia( new Persona("129", "VOS", "AFUERA", 14, Motivo.VIAJE), 3 );
		centro.agregarPersonaADia( new PersonaConOS("129", "Sara", "Paredes", 70, Motivo.VIAJE, "234243", "OSDE"), 3 );

		
		System.out.println(centro.revisar());
		
		centro.mostrarDiaConMasPrioritarios();
		
		centro.mostrarPromedios();
	}

}
