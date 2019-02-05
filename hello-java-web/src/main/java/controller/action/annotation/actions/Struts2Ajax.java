package controller.action.annotation.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

public class Struts2Ajax extends ActionSupport{

	private InputStream inputStream;
	
	@Override
	public String execute() throws Exception {
		System.out.println("kimi");
		
		inputStream=new ByteArrayInputStream("Struts2 Kimi Ajax".getBytes(StandardCharsets.UTF_8));
		
		return "suc";
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

}
