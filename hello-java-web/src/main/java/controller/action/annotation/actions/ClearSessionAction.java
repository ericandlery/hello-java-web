package controller.action.annotation.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/struts2/annotation")
@ResultPath("/")
@Action(value="clearSession")
@Result(name="suc",type="stream",params= {"contentType","text/html","inputName","is"})
public class ClearSessionAction extends ActionSupport{
	
	private InputStream is;

	@Override
	public String execute() throws Exception {
		is = new ByteArrayInputStream("Annotation Ajax String Success!".getBytes("UTF-8"));
		return "suc";
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	@Override
	public String toString() {
		return "TestAjax2Action [is=" + is + "]";
	}
	
}
