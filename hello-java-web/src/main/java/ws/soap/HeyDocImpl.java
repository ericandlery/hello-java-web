package ws.soap;

import javax.jws.WebService;

@WebService(endpointInterface="ws.soap.HeyDocumentWS")
public class HeyDocImpl implements HeyDocumentWS {

	@Override
	public String getDoc(String name) {
		return "Another Hello World? I'm sick and tired of you, "+name+"!";
	}

}
