package controller.action.annotation.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/struts2/annotation")
@ResultPath("/")
@Action(value="clearSession")
@Result(name="suc",type="stream",params= {"contentType","text/html","inputName","is"})
public class ClearSessionAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{
	
	private InputStream is;
	private ServletRequest httpServletRequest;
	private ServletResponse httpServletResponse;

	@Override
	public String execute() throws Exception {
		is = new ByteArrayInputStream("Annotation Ajax String Success!".getBytes("UTF-8"));
		System.out.println("through ajax");
		HttpSession session=((HttpServletRequest)httpServletRequest).getSession();
		session.invalidate();
		return "suc";
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	public ServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}

	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}

	public ServletResponse getServletResponse() {
		return httpServletResponse;
	}

	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.httpServletResponse = httpServletResponse;
	}

	@Override
	public String toString() {
		return "ClearSessionAction [is=" + is + ", httpServletResponse=" + httpServletResponse + "]";
	}
	
}
