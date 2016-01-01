import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;
import com.rta.generic.fp_genric;
import com.rta.generic.pgsearchgenric;


public class pagesearch extends ActionSupport{

	String pname ;
	public List<pgsearchgenric > list = new ArrayList<pgsearchgenric>();
		public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
		public String execute(){
			
			System.out.println("pagesearch.java");
			
			
			
			try{
				int u_id = 43;
				String query=" select * from page_tbl where name = ' " + pname + " ' ";
				Connection con=conne.GetConnection();
				Statement st=con.createStatement();
				ResultSet rspg=st.executeQuery("select pg_id , name , picture , type  from page_tbl  WHERE name LIKE'%"+pname+"%'   ");
				
				System.out.println(pname);
				
				while(rspg.next()){  System.out.println("tyty");
					int pg_id =rspg.getInt("pg_id");
					String pn=rspg.getString("name");
					System.out.println(pn);
					String pt=rspg. getString("type");
					 String pictur = rspg.getString("picture");
					 
					 list.add( new pgsearchgenric( pg_id , pn ,pictur , pt));
					 System.out.println(list);
				}
				System.out.println(list);
				
				
				
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
			
			
			
			return SUCCESS;
		}
		public List<pgsearchgenric> getList() {
			return list;
		}
		public void setList(List<pgsearchgenric> list) {
			this.list = list;
		}
}
