package tata.duoc;

import tata.duoc.datos.BaseDeDatos;
import tata.duoc.datos.Dato;

public class Principal {

	public static void main(String[] args) {
		BaseDeDatos base = new BaseDeDatos();
		base.agregar(new Dato("a1", "algun dato"));
		base.agregar(new Dato("a4", "algun dato"));
		base.agregar(new Dato("b2", "algun dato"));
		

	}

}
