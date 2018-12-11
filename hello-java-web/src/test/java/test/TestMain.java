package test;

import javax.xml.ws.Endpoint;

import ws.soap.HelloWSImpl;
import ws.soap.HeyDocImpl;

public class TestMain {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:7779/kimi/", new HeyDocImpl());

	}

}
