package jsf.validation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;

@ManagedBean(name="v")
public class FormValidationTest {
	
	private static final String PASSWORD="pw";
	
	private String name;
	private byte[] pw;
	
	/* These parameters are required! */
	public void validate(FacesContext ctx,UIComponent uc,Object obj) {
		
		String label=((HtmlInputText)uc).getLabel();
//		System.out.println(label);
		
		if(PASSWORD.equals(label)) {
			byte[] password=((String)obj).getBytes();
			setPw(password);
		}
		
		
		if(((String)obj).trim().length()==0) {
			FacesMessage error=new FacesMessage("Enter Name!");
			ctx.addMessage(uc.getClientId(), error);
		}
//		System.out.println(uc.getCurrentComponent(ctx));
//		System.out.println(obj.getClass());
//		System.out.println(obj);
//		
//		System.out.println("UIC Label="+((HtmlInputText)uc).getLabel());
//		
//		System.out.println("validation starts");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getPw() {
		System.out.println("PWW="+pw);
		return pw;
	}
	public void setPw(byte[] pw) {
		this.pw = pw;
	}

}
