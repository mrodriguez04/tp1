package ar.fiuba.tecnicas.tp1;


import junit.framework.TestCase;

public class testLog extends TestCase {

	public void testLoguerNoExistente(){
		
		Logeable log = Logeable.getInstance("moduloB");
		
		assertEquals(log.get_Nombre(),"loguer default");
	}
	
	public void testCambiaNombreLoguerYSiInstancioOtraIgualMantieneSuNombreCambiado(){
		
		Logeable log = Logeable.getInstance("moduloA");
		log.cambiar_Nombre("pepe");
		Logeable log2 = Logeable.getInstance("moduloA");
		assertEquals(log2.get_Nombre(),"pepe");
	}
	
	public void testInfo(){
		
		Logeable log = Logeable.getInstance("moduloB");
		log.info("TODO BIEN");
		assertEquals(true,true);
	}

	
}
