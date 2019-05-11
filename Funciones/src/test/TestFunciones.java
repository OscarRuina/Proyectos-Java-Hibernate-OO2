package test;

import java.time.LocalDate;
import modelo.Funciones;

public class TestFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha = LocalDate.of(1990, 11, 04);
		LocalDate fecha1 = LocalDate.now();
		System.out.println(Funciones.traerFechaCorta(fecha));
		System.out.println(Funciones.traerFechaCortaMes(fecha));
		System.out.println(Funciones.traerAnio(fecha));
		System.out.println(Funciones.traerMes(fecha));
		System.out.println(Funciones.traerMesNombre(fecha));
		System.out.println(Funciones.traerDia(fecha));
		System.out.println(Funciones.sonFechasIguales(fecha, fecha));
		System.out.println(Funciones.traerFechaCortaMes(fecha1));
        System.out.println(Funciones.sonFechasIguales(fecha, fecha1));
	}

}
