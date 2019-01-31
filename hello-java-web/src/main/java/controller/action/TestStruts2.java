package controller.action;

import com.opensymphony.xwork2.Action;

public class TestStruts2 implements Action{
	
	private String name;
	private Integer num;

	@Override
	public String execute() throws Exception {
		
		System.out.println("form="+toString());
		
		if("".equals(getName()) || null==getNum()) {
			return "err";
		}else {
			return "valid";
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
		return "TestStruts2 [name=" + name + ", num=" + num + "]";
	}

}
