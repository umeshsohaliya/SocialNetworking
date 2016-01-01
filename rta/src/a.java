import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;
import com.rta.generic.fp_genric;


public class a extends ActionSupport{
	
	
		int ptype,difficulty ,pi ,pt ,dl;
		String pn;
		ResultSet rs;
		public List<fp_genric> list = new ArrayList<fp_genric>();
		public int getPtype() {
			return ptype;
		}

		public void setPtype(int ptype) {
			this.ptype = ptype;
		}

		public int getDifficulty() {
			return difficulty;
		}

		public void setDifficulty(int difficulty) {
			this.difficulty = difficulty;
		}

		///////////////////////////////////
		public String execute(){
			System.out.println("dvfefv");
			System.out.println( ptype + " :"  + difficulty);
			
			try{
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			
			if ( ptype == 0 && difficulty == 0){
				System.out.println("a");
					ResultSet rs=st.executeQuery("select * from poll_tbl ");
					while(rs.next()){
						 pn=rs.getString("poll_name");
						 pi=rs. getInt("poll_id");
						 pt=rs. getInt("poll_type");
						 dl=rs. getInt("diff_level");
						 list.add(new fp_genric(pi,pn,pt,dl));
					}
					
					
					
				}
			else if ( ptype == 0 && difficulty != 0) {
				
				System.out.println("b");
					ResultSet rs=st.executeQuery("select * from poll_tbl where diff_level = "+ difficulty +" ");
					while(rs.next()){
						 pn=rs.getString("poll_name");
						 pi=rs. getInt("poll_id");
						 pt=rs. getInt("poll_type");
						 dl=rs. getInt("diff_level");
						 list.add(new fp_genric(pi,pn,pt,dl));
					}
					
					
				}
			else if ( ptype != 0 && difficulty == 0){
				System.out.println("c");
				ResultSet rs=st.executeQuery("select * from poll_tbl where poll_type = "+ ptype +" ");
				while(rs.next()){
					 pn=rs.getString("poll_name");
					 pi=rs. getInt("poll_id");
					 pt=rs. getInt("poll_type");
					 dl=rs. getInt("diff_level");
					 list.add(new fp_genric(pi,pn,pt,dl));
				}
				
				
			}
			else if ( ptype != 0 && difficulty != 0){
				ResultSet rs=st.executeQuery("select * from poll_tbl where diff_level = "+ difficulty +" and poll_type = "+ ptype +" ");
				while(rs.next()){
					 pn=rs.getString("poll_name");
					 pi=rs. getInt("poll_id");
					 pt=rs. getInt("poll_type");
					 dl=rs. getInt("diff_level");
					 list.add(new fp_genric(pi,pn,pt,dl));
				}
				
				
			}
			
			
			
			
			System.out.println(list);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		return SUCCESS;
	}

}
