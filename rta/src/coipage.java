import java.sql.Connection;
import java.sql.Statement;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;


public class coipage extends ActionSupport {
	String t;
	String image="/rta/WebContent/image/page/default page.jpeg";
	String about="none";
	String url="#";
	String name;
	int category;
	
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute()throws Exception{
		System.out.println("coi page.java");
		System.out.println(name);
		
		Map sessiont=ActionContext.getContext().getSession();
		sessiont.put("t", t);
		System.out.println(t);
		System.out.println(category);
		
		
		//st.executeUpdate("insert into page_tbl(creater_id, type ,category ,name ,picture , about ,url) values("+43+",'"+type+"',"+category+",'"+name+"','"+image+"','"+about+"','"+url+"')");
		return SUCCESS;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}

}
