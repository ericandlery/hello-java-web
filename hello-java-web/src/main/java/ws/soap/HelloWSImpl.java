package ws.soap;

import javax.jws.WebService;

@WebService(endpointInterface="ws.soap.HelloWebService")
public class HelloWSImpl implements HelloWebService{

	@Override
	public String getHeadline(String name) {
		return "What do you expect? A "+name+", huh?";
	}

}
