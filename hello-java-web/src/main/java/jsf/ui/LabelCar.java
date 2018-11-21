package jsf.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="labelCar")
@SessionScoped
public class LabelCar {
	
	private String name;
	private String team;
	private Integer rpm;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Integer getRpm() {
		return rpm;
	}
	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
