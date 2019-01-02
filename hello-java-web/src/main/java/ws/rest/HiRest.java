package ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
public class HiRest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String saySomething() {
		return "Hi, my name is Kimi.";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXML() {
		return "<?xml version=\"1.0\"?><name>Kimi</name>";
	}
	
	@GET  
	@Produces(MediaType.TEXT_HTML)  
	public String sayHtmlHello() {  
	   return "<html><title>RS Test</title><body><h1>Hello Ralf</h1></body></html>";  
	}  
	
}
