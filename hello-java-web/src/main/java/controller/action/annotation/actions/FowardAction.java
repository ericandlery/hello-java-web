package controller.action.annotation.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value="/struts2/annotation")
@ResultPath("/")
@Action(value="valid",results= {
		@Result(name="suc",location="login/valid.jsp"),
		@Result(name="er",location="login/err.jsp"),
})
public class FowardAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		return "er";
	}

}
