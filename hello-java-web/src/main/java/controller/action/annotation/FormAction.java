package controller.action.annotation;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespaces(value= {@Namespace("/")})
@Result(location="/struts-anno.jsp")
public class FormAction extends ActionSupport{

}
