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
import com.rta.generic.pgsearchgenric;
import com.sun.org.apache.xpath.internal.operations.And;


public class upldmain extends ActionSupport {
	
	File v,i ;
	String t;
	List<pgsearchgenric> upldlist= new ArrayList<pgsearchgenric>();
	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public List<pgsearchgenric> getUpldlist() {
		return upldlist;
	}

	public void setUpldlist(List<pgsearchgenric> upldlist) {
		this.upldlist = upldlist;
	}

	private String vFileName,iFileName,iContentType;
	
	
	public String getiFileName() {
		return iFileName;
	}

	public void setiFileName(String iFileName) {
		this.iFileName = iFileName;
	}

	public String getiContentType() {
		return iContentType;
	}

	public void setiContentType(String iContentType) {
		this.iContentType = iContentType;
	}

	public File getV() {
		return v;
	}

	public void setV(File v) {
		this.v = v;
	}

	public File getI() {
		return i;
	}

	public String getvFileName() {
		return vFileName;
	}

	public void setvFileName(String vFileName) {
		this.vFileName = vFileName;
	}

	public void setI(File i) {
		this.i = i;
	}

	public String execute (){
		Map session=ActionContext.getContext().getSession();
		int ui = (Integer) session.get("u_id");
		System.out.println("upldmain.java");
		System.out.println("v" + v );
		System.out.println("content type = "+iContentType);
		System.out.println(vFileName);
		
		if (iContentType.equals("image/png")   ) {
			t = "i";
		}
		
		if (iContentType.equals("image/jpeg") ){
			t = "i";
		}
		
		if (iContentType.equals("image/jpg") ){
			t = "i";
		}
		
		if (iContentType.equals("image/bmp") ){
			t = "i";
		}
		
		if (iContentType.equals("image/gif") ){
			t = "i";
		}
		
		System.out.println("out of try " );
		try{
			System.out.println("in the try " );
			Connection con=conne.GetConnection();
		Statement st=con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from upld_tbl");
		List ls =  new ArrayList();
		while(rs.next()){
			int a = rs.getInt("pro_ID");
			//System.out.println(a);
			ls.add(a);
		}
		int name = (Integer) ls.get(ls.size()-1) +1 ;
		
		System.out.println("image name is " + name);
		System.out.println("t is :"+t);
		if (t == "i"){
			System.out.println("t=i ");
			//String imgname ="umesh";
			String sourceFilePath = i.getAbsolutePath();
			/*System.out.println(sourceFilePath);*/
			File sourceFile = new File(sourceFilePath);
			File destnationFile = new File("C:/workspace_4413/rta/WebContent/image/upload/"+ name + ".jpg");
			FileUtils.copyFile(sourceFile, destnationFile);
			String i = name + ".jpg";
			System.out.println("image put on folder");
			System.out.println(i);
			st.executeUpdate("insert into upld_tbl ( pro_type ,path , uplder_id ) values( '"+ t +"','"+ i +"' ,"+ ui +"  )");
			System.out.println("insertion operation of image over");
		}
		
		
		
		String tname ="A" +session.get("ph");
		
		
		st.executeUpdate("insert into " + tname + "(pi, pt ,path , uploder ) values("+name +",'"+t+"' , '" +i+ "' , '"+ ui  +"'  )");
		System.out.println("search from dummy table ");
		
		ResultSet rsupld = st.executeQuery("select *  from "+ tname +" ORDER BY pi DESC    ");
			while(rsupld.next()){
				int api = rsupld.getInt("pi");
				String apt = rsupld.getString("pt");
				String apath = rsupld.getString("path");
				String aname= rsupld.getString("uploder");
				upldlist.add(new pgsearchgenric(api,apt,apath,apath));
				System.out.println("upldlist final:"+ upldlist);
			}
		
		
		
		
		// image/jpeg  image/png  image/jpg image/gif image/bmp
		
		//audio/mpeg
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return SUCCESS;
	}
	
}
