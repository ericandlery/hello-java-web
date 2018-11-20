package jsf.hello;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloJSF")
@SessionScoped
public class HelloJSF implements Serializable{
	
	private static final long serialVersionUID = 2277647901012924691L;
	
	private String name="Hi Kimi.";
	private Date date=new Date();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
