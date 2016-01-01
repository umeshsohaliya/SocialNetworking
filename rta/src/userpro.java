import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;


public class userpro extends ActionSupport{

	int p_id;
	
	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String execute(){
		
		System.out.println("userpro.java");
		
		Map session=ActionContext.getContext().getSession();
		session.put("p_id",p_id);
		
		
		try{
			
			
			
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			
			
			ResultSet rsuserpro = st.executeQuery("select *  from reg_tbl where u_id= "+p_id+" ");
			
				
			
			
			
			
			
		}
		catch (Exception e) {
			
			
			
		}
		
		
		
		
		return SUCCESS;
	}
}
