package controller.action.annotation.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value="/struts2/annotation")
@ResultPath(value="/")
@Result(location="login.jsp")
//@Action(value="signin")
@Actions(value= {@Action(value=""),@Action(value="sign")})
public class LoginAction extends ActionSupport{

}
