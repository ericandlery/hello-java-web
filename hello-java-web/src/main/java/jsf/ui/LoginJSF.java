package jsf.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginJSF {
	
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String validate() {
		if("kimi".equals(id) && "ralf".equals(pw)) {
			return "login_test";
		}else {
			return "login_failed";
		}
	}

}
