package tata.duoc.datos.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tata.duoc.datos.BaseDeDatos;
import tata.duoc.datos.Dato;

public class ModificarTest {

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
	public void cuandoModificaRetornaTrue() {
		boolean modifico = this.base.modificar(new Dato("a2", "algo mas que un simple dato"));
		assertTrue(modifico);
	}
	
	@Test
	public void cuandoNOmodificaRetornaFalse() {
		boolean modifico = this.base.modificar(new Dato("p2", "apuesto que no modifica"));
		assertFalse(modifico);
	}

}
