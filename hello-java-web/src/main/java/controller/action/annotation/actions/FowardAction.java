package controller.action.annotation.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
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
	
	private HttpServletRequest req=ServletActionContext.getRequest();
	private HttpServletResponse resp=ServletActionContext.getResponse();
	
	private String name;
	private Integer num;
	
	private static final String NAME="kimi";
	private static final Integer NUM=31;

	@Override
	public String execute() throws Exception {
		
		System.out.println(toString());
		
		HttpSession session=req.getSession();
		
		session.setAttribute("name",name);
		session.setAttribute("num",num);
		
		if(NAME.equals(name) && NUM.equals(num)) {
			return "suc";
		}else {
			return "er";
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "FowardAction [name=" + name + ", num=" + num + "]";
	}

}
