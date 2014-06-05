package ar.fiuba.tecnicas.tp1.propiedades;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;





public class ParserXML {
	SAXHandler handler;
	
	
	public void Inicio(String path, XMLPropiedades prop) throws SAXException, IOException, ParserConfigurationException{
		
		 SAXParserFactory parserFactor = SAXParserFactory.newInstance();
		 SAXParser parser = parserFactor.newSAXParser();
		 handler = new SAXHandler();
		 handler.set_Propiedades(prop);
		 InputStream file = new FileInputStream(path);
		 parser.parse(file,handler);
		 
	}
		
	public XMLPropiedades get_propiedades(){
		return handler.get_propiedades();
	}
	
	
	
	

}
