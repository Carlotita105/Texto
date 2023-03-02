package com.cursoceat.Main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Texto {
	
	private String cad;
	LocalDate creacion;
	LocalDateTime ultimaModificacion;
	private final int LONGITUD_MAXIMA;
	static final String VOCALE_STRING="aeiouáéíóú";
	
	public Texto (int longitud) { //paso de valor
		this.LONGITUD_MAXIMA=longitud; // asigno a la constante y se inicializa
		this.cad="";
		this.creacion=LocalDate.now();
		this.ultimaModificacion=null;
		//En este momento cuando se crea el objeto con el constructor 
		//Se inicializan todos los atributos de la clase
		
	}
	public void addFinal(char c) {
		if (this.LONGITUD_MAXIMA>this.cad.length()) {
			this.cad=this.cad+c; // la cadena+ caracter que hemos recibido
			this.ultimaModificacion=LocalDateTime.now();
			
		}
	}
	public void addfinal (String cadena) {
		if(this.LONGITUD_MAXIMA>this.cad.length()+cadena.length()) {
		this.cad=this.cad+cadena;
		this.ultimaModificacion=LocalDateTime.now();
	}
		
	}
	
	public void addInicio(char c) {
		if (this.LONGITUD_MAXIMA>cad.length()) {
			this.cad=c+this.cad; //caracter + cadena que hemos recibido
			this.ultimaModificacion=LocalDateTime.now();
		}
	}
	public void addInicio (String cadena) {
		if (this.LONGITUD_MAXIMA>this.cad.length()+cadena.length()) {
			this.cad=cadena+this.cad; 
			this.ultimaModificacion=LocalDateTime.now();
}
	}
	public void mostrar() {
		DateTimeFormatter formato1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("fehcha de creacion: "+ this.creacion.format(formato1));
		DateTimeFormatter formato2=DateTimeFormatter.ofPattern("dd/MM/yyyy' Hora: 'hh:mm:ss");
		System.out.println("fecha de la ultima modificacion: "+this.ultimaModificacion.format(formato2));
		System.out.println("La cadena es: \n" +this.cad);
	}
}
