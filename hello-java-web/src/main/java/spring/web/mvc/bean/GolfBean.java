package spring.web.mvc.bean;

import java.util.Date;

public class GolfBean {
	
	private String name;
	private Integer num;
	private Double power;
	private Long yard;
	private Date date;
	
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
	public Double getPower() {
		return power;
	}
	public void setPower(Double power) {
		this.power = power;
	}
	public Long getYard() {
		return yard;
	}
	public void setYard(Long yard) {
		this.yard = yard;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "GolfBean [name=" + name + ", num=" + num + ", power=" + power + ", yard=" + yard + ", date=" + date
				+ "]";
	}

}
