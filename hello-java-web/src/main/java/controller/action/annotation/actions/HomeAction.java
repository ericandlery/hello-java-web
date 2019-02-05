package controller.action.annotation.actions;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value="/struts2Home")
@ResultPath(value="/")
@Result(name="house",location="/struts2/annotation/home.jsp")
public class HomeAction extends ActionSupport{

}
