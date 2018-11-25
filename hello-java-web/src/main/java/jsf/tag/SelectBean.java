package jsf.tag;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
public class SelectBean {

	private String remote;
	private List<String> list;

	public String getRemote() {
		return remote;
	}

	public void setRemote(String remote) {
		this.remote = remote;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		System.out.println(list);
		this.list = list;
	}
	
}
