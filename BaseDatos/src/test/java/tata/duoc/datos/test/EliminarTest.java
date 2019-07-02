package tata.duoc.datos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tata.duoc.datos.BaseDeDatos;
import tata.duoc.datos.Dato;

public class EliminarTest {
	
	@Autowired
	private BaseDeDatos base;

	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		base.agregar(new Dato("a1", "algun dato"));
		base.agregar(new Dato("a2", "algun dato"));
		base.agregar(new Dato("a3", "algun dato"));
	}

	@Test
	public void cuandoEliminaRetornaTrue() {
		boolean elimina = this.base.eliminar("a2");
		assertTrue(elimina);
	}
	
	
	

}
