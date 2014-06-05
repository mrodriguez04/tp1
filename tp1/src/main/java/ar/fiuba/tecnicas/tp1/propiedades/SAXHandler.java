package ar.fiuba.tecnicas.tp1.propiedades;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class SAXHandler extends DefaultHandler {

		 
		  String content = null;
		  XMLPropiedades prop;
		  @Override
		  //Triggered when the start of tag is found.
		  public void startElement(String uri, String localName, 
		                           String qName, Attributes attributes) 
		                           throws SAXException {

		    switch(qName){
		      //Create a new Employee object when the start tag is found
		    case "LogLevel":
		    	 prop.set_logLevel(attributes.getValue("LogLevel"));
		    	break;
		      case "Aplicacion":
		        prop.set_Aplicacion(attributes.getValue("Aplicacion"));
		        break;
		      case "Formato":
		    	prop.set_Formateo(attributes.getValue("Formato"));
		    	break;
		      case "Archivo":
		    	prop.set_ArchivoLog(attributes.getValue("Archivo"));
		    	break;
		      case "Loger":
			    prop.set_Logger(attributes.getValue("Loger"));
			       break;
		    
		    }
		    content = "";
		  }

		  // @Override
		 /* public void endElement(String uri, String localName, 
		                         String qName) throws SAXException {
		   switch(qName){
		     //Add the employee to list once end tag is found
		     
		     //For all other end tags the employee has to be updated.

		   }
		  }*/

		  @Override
		  public void characters(char[] ch, int start, int length) 
		          throws SAXException {
		    content = content + new String(ch, start, length); 
		    
		  }
		  
		  public void set_Propiedades(XMLPropiedades prop){
			  this.prop = prop;
		  }
		  		  
		  
		  public XMLPropiedades get_propiedades(){
			  return this.prop;
		  }
		 
	}
	

	
	

