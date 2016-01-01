import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;
import com.rta.generic.rhs_genric;


public class pgupld extends ActionSupport{

	File i;
	public List<rhs_genric> upldlist = new ArrayList<rhs_genric>();
	
	public File getI() {
		return i;
	}

	public void setI(File i) {
		this.i = i;
	}

	public String execute(){
		System.out.println("pgupld");
		
		Map session =ActionContext.getContext().getSession();
		int pgid = (Integer) session.get("pgid");
		
		
		
		try{
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			
			ResultSet rs= st.executeQuery("select * from pgupld");
			List ls =  new ArrayList();
			System.out.println("array intialize");
			while(rs.next()){
				int a = rs.getInt("proid");
				System.out.println("aaa");
				System.out.println(a);
				ls.add(a);
			}
			int name = (Integer) ls.get(ls.size()-1) +1 ;
			
			
			String imgname ="umesh";
			String sourceFilePath = i.getAbsolutePath();
			/*System.out.println(sourceFilePath);*/
			File sourceFile = new File(sourceFilePath);
			File destnationFile = new File("C:/workspace_4413/rta/WebContent/image/pgupld/"+ name + ".jpg");
			FileUtils.copyFile(sourceFile, destnationFile);
			String dbi=name + ".jpg";
			
			
			st.executeUpdate("insert into pgupld(pgid , path) values ("+pgid+" , '"+ dbi +"')  ");
			
			
			
			ResultSet rsupld = st.executeQuery("select * from pgupld where pgid="+ pgid +" order by proid desc ");
			while(rsupld.next()){
				int a = rsupld.getInt("pgid");
				String s= rsupld.getString("path");
				upldlist.add(new rhs_genric(a,s));
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		return SUCCESS;
	}
}
