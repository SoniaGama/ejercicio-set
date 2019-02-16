package com.ejercicios.set;

import java.util.*;

public class AddAndTime implements InterfaceAddTiempo{

	@Override
	public void AddSet(Collection<Integer> setExample) {
		for (int n = 1; n <= 10; n++) {
			setExample.add(n);
		}
	}
	
	@Override
	public void TiempoSet(long TiempoFinal, long TiempoInicial, String NombreColeccion) {
		System.out.println((TiempoFinal - TiempoInicial) + " nanosegundos" + NombreColeccion);
	}	
}
