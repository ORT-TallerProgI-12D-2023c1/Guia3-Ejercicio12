package ejercicio12;

import java.util.ArrayList;

import ejercicio12.personas.Persona;

public class CentroDeTesteo {
	private ArrayList<Dia> dias;

    public CentroDeTesteo() {
        dias = new ArrayList<Dia>();
        for (int i = 1; i <= 7; i++) {
            dias.add(new Dia(i));
        }
    }
    
    public void agregarPersonaADia(Persona p, int numDia) {
    	// Asumo que el numDia es válido (pero no lo hagan)
    	dias.get(numDia-1).agregarPersona(p);
    }
    
    public double revisar () {
    	double porc = 0;
    	int acuPersonasSobrantes = 0;
    	int acuPersonasTotal = 0;
    	
    	for (Dia dia : dias) {
			acuPersonasSobrantes += dia.revisar();
			acuPersonasTotal += dia.getCantInscriptos();
		}    	   	
    	
    	return calcPorcentaje(acuPersonasSobrantes, acuPersonasTotal);
    }
    
    public void mostrarDiaConMasPrioritarios() {
    	
    	int max = -1;
    	Dia diaMax = null;
    	
    	for (Dia dia : dias) {
			int cantPrioritarios = dia.getCantPersonasConPrioridad(Priorizable.PRIORIDAD_MAX);
			if (cantPrioritarios > max) {
				max = cantPrioritarios;
				diaMax = dia;
			}
		}
    	
    	if (diaMax != null) {
    		System.out.println(diaMax.getFecha() + ": " + max);
    	}
    }
    
    public void mostrarPromedios() {
    	for (Dia dia : dias) {
			System.out.println(dia.getFecha() + " " + dia.promedioEdadPersonasSinOS());
		}
    }
    
    

	private double calcPorcentaje(double casos, double totales) {
		return totales == 0 ? 0 : casos / totales * 100;
	}


}
