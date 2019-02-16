package com.ejercicios.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TiemposSetMain extends AddAndTime {
	
	//Ejercicio 1.
	//Demostrar que la implementación de TreeSet es más lento que HashSet y LinkedHashSet. 

	public static void main(String[] args) {

		long TiempoInicial;
		long TiempoFinal;
		AddAndTime metodos = new AddAndTime();		
		
		TiempoInicial = System.nanoTime();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		metodos.AddSet(treeSet);		
		TiempoFinal = System.nanoTime();		
		metodos.TiempoSet(TiempoFinal, TiempoInicial, ": TreeSet");		

		TiempoInicial = System.nanoTime();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		metodos.AddSet(linkedHashSet);
		TiempoFinal = System.nanoTime();
		metodos.TiempoSet(TiempoFinal, TiempoInicial, ": LinkedHashSet");

		TiempoInicial = System.nanoTime();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		metodos.AddSet(hashSet);
		TiempoFinal = System.nanoTime();
		metodos.TiempoSet(TiempoFinal, TiempoInicial, ": HashSet");
	}

}
