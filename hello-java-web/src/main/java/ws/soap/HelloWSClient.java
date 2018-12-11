package ws.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWSClient {
	
	public static void main(String[] args) throws MalformedURLException {
		
		URL url=new URL("http://localhost:7779/kimi/?wsdl");
		QName qName=new QName("http://soap.ws/", "HeyDocImplService");
		Service service=Service.create(url,qName);
		HeyDocumentWS hs=service.getPort(HeyDocumentWS.class);
		System.out.println(hs.getDoc("Ralf"));
		
	}

}
