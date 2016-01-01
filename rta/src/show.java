import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;
import com.rta.generic.rhs_genric;


public class show extends ActionSupport {

	int pgid;
	public List<rhs_genric> upldlist = new ArrayList<rhs_genric>();
	
	public int getPgid() {
		return pgid;
	}

	public void setPgid(int pgid) {
		this.pgid = pgid;
	}

	public String execute()throws Exception{
		System.out.println("show.java");
		
		try
		{
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from page_tbl where pg_id="+ pgid +"  ");
		
			while(rs.next()){
				
				int cid= rs.getInt("creater_id");
				int pgid= rs.getInt("pg_id");
				String pgnm= rs.getString("name");
				String pgtype= rs.getString("type");
				String pgpict= rs.getString("picture");
				String pgabout= rs.getString("about");
				String pgurl= rs.getString("url");
				
				Map session=ActionContext.getContext().getSession();
				session.put("cid",cid);
				session.put("pgid", pgid);
				session.put("pgnm",pgnm);
				session.put("pgtype",pgtype);
				session.put("pgpict", pgpict);
				session.put("pgabout",pgabout);
				session.put("pgurl",pgurl);
				
				
				ResultSet rsupld = st.executeQuery("select * from pgupld where pgid="+ pgid +" order by proid desc  ");
				while(rsupld.next()){
					int a = rsupld.getInt("pgid");
					String s= rsupld.getString("path");
					upldlist.add(new rhs_genric(a,s));
				}
				
				
				int uid = (Integer) session.get("u_id");
				System.out.println(  uid  );
				System.out.println("fgfdgdgb");
				if (uid == cid){
					return ERROR;
				}
				
			}
			return SUCCESS;
		}
		catch (Exception e) {
			System.out.println(e);
			//return SUCCESS;
		}
		return SUCCESS;
	}

}

