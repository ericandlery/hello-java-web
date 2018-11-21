package jsf.hello;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="heyJSF")
@RequestScoped
public class HeyJSF implements Serializable{

	private static final long serialVersionUID = -4165223183534590808L;
	
	private List<String> list=new ArrayList<>();
	private Map<String,Object> map=new HashMap<>();
	private HelloBean hb=new HelloBean();

	public List<String> getList() {
		list.add("kimi list");
		list.add("ralf list");
		list.add("mika list");
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Object> getMap() {
		map.put("kimi",new Date());
		map.put("rpm",19000);
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public HelloBean getHb() {
		hb.setDate(Calendar.getInstance().getTime());
		hb.setName("Pastor");
		hb.setNum(777);
		return hb;
	}

	public void setHb(HelloBean hb) {
		this.hb = hb;
	}

}
