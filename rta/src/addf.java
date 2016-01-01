import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import org.apache.catalina.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;


public class addf extends ActionSupport{

	
	
	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	int p_id;
	
	
	public String execute(){
		System.out.println("addf.java");
		
		Map session=ActionContext.getContext().getSession();
		int u_id =  (Integer) session.get("u_id");
		System.out.println(   session.get("u_id") );
		String f = "f";
		
		try{
			
		Connection con=conne.GetConnection();
		Statement st=con.createStatement();
		
		st.executeUpdate(" insert into frnd_tbl values("+u_id+" , "+ p_id +" , '"+f+"' ) ");
		
		String val ="Add Friend";
		//int p_id =  (Integer) session.get("u_id");
		
		String nm = (String) session.get("un");
		
		String txt = nm + " want to become your friend";
		
		st.executeUpdate(" insert into noti_tbl(u_id , text ,value , p_id) values('"+ p_id +"' ,'" + txt+"' , '"+ val+"', "+ u_id +" ) ");
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return SUCCESS;
	}
	
}
