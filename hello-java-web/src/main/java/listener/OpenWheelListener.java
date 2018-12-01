package listener;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class OpenWheelListener implements ActionListener{
	
	private String name;
	private String team;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		System.out.println("get="+team);
		return team;
	}

	public void setTeam(String team) {
		System.out.println("set="+team);
		this.team = team;
	}

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		
		UIComponent uc=event.getComponent();
//		System.out.println(uc.getClass().getName());
//		System.out.println(name);
		
	}
	
	public void onChange(ValueChangeEvent event) {
		System.out.println(event.getOldValue());
		System.out.println(event.getNewValue());
//		System.out.println(team);
		System.out.println("value change event");
	}

}
