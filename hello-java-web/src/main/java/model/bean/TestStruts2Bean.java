package model.bean;

public class TestStruts2Bean {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TestStruts2Bean [text=" + text + "]";
	}

}
