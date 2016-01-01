import java.sql.Connection;
import java.sql.Statement;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;


public class logout extends ActionSupport {

	
	public String execute()throws Exception{
		Map session = ActionContext.getContext().getSession();
		session.remove("e_id");
		session.remove("pass");
		session.remove("u_id");
		String tname= "A" + session.get("ph");
		
		Connection con=conne.GetConnection();
		Statement st=con.createStatement();
		
		st.executeUpdate(" DROP TABLE "+tname+"; " );
		return SUCCESS;
	}
}
