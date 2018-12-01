package jsf.tag;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="tagBean")
public class TagBean {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
