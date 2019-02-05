package controller.action.annotation.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value="/home")
@ResultPath(value="/")
public class ComeAction extends ActionSupport{

	@Override
	@Action(value="come",results= {@Result(name="success",location="/struts2/annotation/come.jsp")})
	public String execute() throws Exception {
		return SUCCESS;
	}

}
