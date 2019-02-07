package controller.action.annotation.actions;

import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.Action;

/* Didn't work, will try it later. */
@org.apache.struts2.convention.annotation.Action("interAnno")
@Result(name="suc",location="home.jsp")
public class FormInterfaceAction implements Action{

	@Override
	public String execute() throws Exception {
		
		return "suc";
	}

}
