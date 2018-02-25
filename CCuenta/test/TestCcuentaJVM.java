import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCcuentaJVM {

	private Ccuenta miCuenta;
	
	@Before
	public void testCuentaJVM() {
		miCuenta=new Ccuenta("Ana","López",3200,1);
		assertNotNull(miCuenta);
		
	}
	
	@After
	public void finPruebas() {
		miCuenta=null;//eliminamos el objeto
	}
	
	@Test
	public void testSaldoJVM() throws Exception {
			double sald=miCuenta.getSaldo();
			assertEquals(3200,sald,0);
		}

	@Test
	public void testIngresarJVM()throws Exception {
		miCuenta.ingresar(600);
		assertEquals(3800,miCuenta.getSaldo(),0);
	}
	@Test(expected=Exception.class)
	public void testIngresarNegJVM() throws Exception{
		miCuenta.ingresar(-600);
	}
	@Test
	public void testRetirarJVM() throws Exception{
		miCuenta.retirar(600);
		assertEquals(2600,miCuenta.getSaldo(),0);
	}
	@Test(expected=Exception.class)
	public void saldoNegativoJVM() throws Exception{
		miCuenta.retirar(13000);
	}
}
