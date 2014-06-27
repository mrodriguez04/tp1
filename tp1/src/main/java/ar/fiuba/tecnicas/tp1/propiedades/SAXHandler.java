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
			content = "";
		    switch(qName){
		      //Create a new Conf object when the start tag is found
		    		
		    case "Tests":
		    	   	break;
		      case "Config":
		             break;
		      
		    
		    }
		  
		  }

		  // @Override
		 public void endElement(String uri, String localName, 
		                         String qName) throws SAXException {
			 
			 switch(qName){
		     //Add the employee to list once end tag is found
						   case "LogLevel":
						    	 prop.set_logLevel(content);
						    	break;
						   case "Aplicacion":
						        prop.set_Aplicacion(content);
						        break;
						   case "Formato":
						    	prop.set_Formateo(content);
						    	
						    	break;
						   case "Archivo":
						    	prop.set_ArchivoLog(content);
						    	break;
						   case "Loguer":
							    prop.set_Logger(content);
							    break;
						   case "Filtro":
							     prop.set_Filtro(content);
						         break;
						   case "TipoFiltro":
							   	 prop.set_TipoFiltro(content);
							   	 break;
						   case "FJSON":
							     prop.set_fjson(content);
							     break;
		     //For all other end tags the employee has to be updated.

		   }
		   content ="";
		  }

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
	

	
	

