package tata.duoc.datos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tata.duoc.datos.BaseDeDatos;
import tata.duoc.datos.Dato;

public class AgregarTest {
	
	@Autowired
	private BaseDeDatos base;

	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoAgregaEntoncesRetornaTrue() {
		boolean agrega = this.base.agregar(new Dato("c2", "esto es una prueba de agregar"));
		assertTrue(agrega);
	}
	

}
