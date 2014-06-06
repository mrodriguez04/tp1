package ar.fiuba.tecnicas.tp1;


import junit.framework.TestCase;

public class testLog extends TestCase {

	public void testLoguerNoExistente(){
		
		Logeable log = Logeable.getInstance("moduloA");
		
		assertEquals(log.get_Nombre(),"loguer default");
	}
	

	
}
