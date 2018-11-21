package jsf.tag;

import java.util.Date;

public class FormulaTeamBean {
	
	private String name;
	private String location;
	private int year;
	private Date date;
	private long rpm;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getRpm() {
		return rpm;
	}
	public void setRpm(long rpm) {
		this.rpm = rpm;
	}

}
