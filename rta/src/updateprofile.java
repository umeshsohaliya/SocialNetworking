import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;


public class updateprofile extends ActionSupport {

	public String execute(){
		
		try
		{
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			Map session=ActionContext.getContext().getSession();
			int uid = (Integer) session.get("u_id");
			
			System.out.println(uid);
			
			
			
			ResultSet rs=st.executeQuery("select * from reg_tbl where U_ID = '"+ uid +"' ");
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return SUCCESS;
	}
	
	
}
