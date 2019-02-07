package controller.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.bean.TestStruts2Bean;

@Namespace("/")
@Action("formValid")
@Result(name="suc",location="form.jsp")
public class FormValidationAction extends ActionSupport implements ModelDriven<TestStruts2Bean>{
	
	private String type;
	private String text;
	private TestStruts2Bean bean; 

	@Override
	public String execute() throws Exception {
		
		System.out.println(bean);
		System.out.println("text="+text);
		
		if("form".equals(type)) {
			System.out.println("Validation Mode");
			
			
			
			return "suc";
		}else {
			System.out.println("Entry Mode");
			return "suc";
		}
		
	}

	@Override
	public void validate() {
		System.out.println("Validation Block");
		if("".equals(text)) {
			addFieldError("text","Empty Text!");
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

//	public TestStruts2Bean getBean() {
//		return bean;
//	}
//
//	public void setBean(TestStruts2Bean bean) {
//		this.bean = bean;
//	}

	@Override
	public TestStruts2Bean getModel() {
		return bean;
	}

}
