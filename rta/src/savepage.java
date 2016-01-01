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


public class savepage extends ActionSupport{
	
	String pt,pn,category , desc,link;
	public List flist = new ArrayList();
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	File imagefile;
	
	
	public String getPt() {
		return pt;
	}


	public void setPt(String pt) {
		this.pt = pt;
	}


	public String getPn() {
		return pn;
	}


	public void setPn(String pn) {
		this.pn = pn;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public File getImagefile() {
		return imagefile;
	}


	public void setImagefile(File imagefile) {
		this.imagefile = imagefile;
	}

	List ls =  new ArrayList();
	public String execute(){
		System.out.println("savepage.java");
		System.out.println(pt + pn + category +link + desc + imagefile );
		try{
			
			
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from page_tbl");
			while(rs.next()){
				int a = rs.getInt("pg_id");
				System.out.println(a);
				ls.add(a);
			}
			
			int name = (ls.size() + 1);
			
			
			String sname = ""+name +".jpg" ;
			//st.executeUpdate("insert into image(path,name) values('"+sname+"','"+name+"')");
			System.out.println(sname);
			
			String sourcepath=imagefile.getAbsolutePath();
			System.out.println("source path" + sourcepath);
			File sourFile=new  File(sourcepath);
			File destinatiFile = new File("C:/workspace_4413/rta/WebContent/image/page/"+ name + ".jpg");
			FileUtils.copyFile(sourFile, destinatiFile);
			String filename = sname;
			//session.put("filename", filename);
			System.out.println("s name:" + sname);
			System.out.println(filename);
			
			Map session=ActionContext.getContext().getSession();
			int a = (Integer) session.get("u_id");
			
			 st.executeUpdate("insert into page_tbl(creater_id, type ,category ,name ,picture , about ,url) values("+ a +",'"+pt+"',"+category+",'"+pn+"','"+filename+"','"+desc+"','"+link+"')");
			System.out.println("over work of page creation");
			
	//////////////////////////over work of page creation /////////////////////////////////////		
			
			
			
			
			
			
			
			
	/////////////////////////////////////////select friend id  /////////	
			
			
			String t ="t";
			ResultSet rsfrnd = st.executeQuery("select f_id  from frnd_tbl where u_id = "+ a +" and accept = '"+ t +"'  ");	
			
			while(rsfrnd.next()){
				
				int fi = rsfrnd.getInt("f_id");
				flist.add(fi);	
					
			}
			System.out.println("select friend id");
			
	///////////////////////////////// bselect page id  ////////////////
			
			System.out.println(a);
			ResultSet rsa= st.executeQuery("select pg_id , name , picture from page_tbl where creater_id = "+ a +"  ");
			List ls =  new ArrayList();
			while(rsa.next()){
				int temp = rsa.getInt("pg_id");
				System.out.println(temp);
				ls.add(temp);
			}
			
			
			int p_id = (Integer) ls.get(ls.size()-1);
			
			System.out.println("bselect page id");
			////////////////////////////////insert in notification taable////////////////////////
			
			
			String text ="your friend" + session.get("un") +  " create new page" + pn;
			String value= "show";
			int size= flist.size();
			for(int i=0 ;i<size; i++){
				
				st.executeUpdate("insert into noti_tbl(u_id, text ,value ,p_id ) values("+ flist.get(i) +",'"+text+"','"+ value +"',"+p_id+") ");
				
			}
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		return SUCCESS;
	}

}
