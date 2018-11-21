package jsf.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NavigationBean {
	
	private String name;
	private String action;
	
	@ManagedProperty(value="#{param.param}")
	private String param;
	@ManagedProperty(value="#{param.param2}")
	private String param2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public String view() {
		return "form";
	}
	
	public String redir() {
		return "red";
	}
	
	public String choice() {
		System.out.println(param);
		System.out.println(param2);
		if(param2==null) {
			return "/jsf/2/nav?faces-redirect=true";
		}else {
			return "nav";
		}
	}

}
