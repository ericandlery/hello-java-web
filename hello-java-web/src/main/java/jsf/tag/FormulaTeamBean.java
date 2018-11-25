package jsf.tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormulaTeamBean {
	
	private String name;
	private String location;
	private int year;
	private Date date;
	private long rpm;
	
	private static final List<FormulaTeamBean> list=new ArrayList<>(
			Arrays.asList(
					new FormulaTeamBean("kimi","Woking",2002,new Date(),18200),
					new FormulaTeamBean("ralf","Wantage",2003,new Date(),19000),
					new FormulaTeamBean("mika","Silverstone",1999,new Date(),17400),
					new FormulaTeamBean("pastor","Troll",2012,new Date(),18000),
					new FormulaTeamBean("alonso","Enstone",2005,new Date(),18800)
			));
	
	public List<FormulaTeamBean> getList() {
		return list;
	}
	
	public FormulaTeamBean(String name,String location,int year,Date date,long rpm) {
		this.name=name;
		this.location=location;
		this.year=year;
		this.date=date;
		this.rpm=rpm;
	}
	public FormulaTeamBean() {
		
	}
	
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
	
	public List<FormulaTeamBean> getTableBean(){
		return Arrays.asList(
				new FormulaTeamBean("kimi","Woking",2002,new Date(),18200),
				new FormulaTeamBean("ralf","Wantage",2003,new Date(),19000),
				new FormulaTeamBean("mika","Silverstone",1999,new Date(),17400),
				new FormulaTeamBean("pastor","Troll",2012,new Date(),18000),
				new FormulaTeamBean("alonso","Enstone",2005,new Date(),18800)
		);
	}
	
	public Map getMap() {
		Map<String,String> map=new HashMap<>();
		map.put("red","Ferrari");
		map.put("silver","McLaren");
		map.put("blue","Williams");
		return map;
	}

}
