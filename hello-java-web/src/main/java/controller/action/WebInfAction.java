package controller.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@Action("webinf")
@Result(location="home.jsp")
/* Without @ResultPath, it will direct to WEB-INF/content/ */
public class WebInfAction extends ActionSupport{

}
