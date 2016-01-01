

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;
import com.rta.generic.searchfriend_generic;



public class abc extends ActionSupport {
	
public String fsearch;

public List<searchfriend_generic> list = new ArrayList<searchfriend_generic>();
	public String getFsearch() {
	return fsearch;
}

public void setFsearch(String fsearch) {
	this.fsearch = fsearch;
}


	public String execute()throws Exception{
		System.out.println("abc.java");
		
		Map session=ActionContext.getContext().getSession();
		session.put("fsearch",fsearch);
		System.out.println(fsearch);
		
		
		
		Connection con=conne.GetConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select F_NAME , L_NAME , I_PATH, WORK , U_ID from reg_tbl where F_NAME LIKE '%"+ fsearch +"%'  or L_NAME LIKE '%"+fsearch+"%' ");
		int a =0;
		while(rs.next()){
			String f=rs.getString("F_NAME");
			String l=rs. getString("L_NAME");
			String i=rs. getString("I_PATH");
			String w=rs. getString("WORK");
			int u=rs. getInt("U_ID");
			list.add(new searchfriend_generic(u,f,l,i,w));
			//list.add(new String(s));
			System.out.println(f);
			a=a+1;
		}
		System.out.println("list is"+ list);
		session.put(list, "list");
		return SUCCESS;
	}

}
