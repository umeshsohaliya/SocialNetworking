import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;
import com.rta.generic.pgsearchgenric;
import com.rta.generic.rhs_genric;



public class logcheck extends ActionSupport {
	String e_id ,pass, text ,value ;
	int u_id ,pid ;
	String ubi;
	public String getUbi() {
		return ubi;
	}



	public void setUbi(String ubi) {
		this.ubi = ubi;
	}

	public List<rhs_genric> rhslist = new ArrayList<rhs_genric>();
	public List<rhs_genric> pglist = new ArrayList<rhs_genric>();
	public List<rhs_genric> polllist = new ArrayList<rhs_genric>();
	public List flist = new ArrayList();
	public List<pgsearchgenric> upldlist= new ArrayList<pgsearchgenric>();
	public List<rhs_genric> notilist = new ArrayList<rhs_genric>();
	public List uploder = new ArrayList();
	
	////////////////////////////
	public List api = new ArrayList();
	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public List getApi() {
		return api;
	}



	public void setApi(List api) {
		this.api = api;
	}



	public List getApt() {
		return apt;
	}



	public void setApt(List apt) {
		this.apt = apt;
	}



	public List getApath() {
		return apath;
	}



	public void setApath(List apath) {
		this.apath = apath;
	}



	public List getApname() {
		return apname;
	}



	public void setApname(List apname) {
		this.apname = apname;
	}



	public int getLog() {
		return log;
	}



	public void setLog(int log) {
		this.log = log;
	}



	public String getTname() {
		return tname;
	}



	public void setTname(String tname) {
		this.tname = tname;
	}

	public List apt = new ArrayList();
	public List apath = new ArrayList();
	public List apname = new ArrayList();
	
	
	public List<rhs_genric> getNotilist() {
		return notilist;
	}



	public void setNotilist(List<rhs_genric> notilist) {
		this.notilist = notilist;
	}



	/** 
	 * @return the e_id
	 */
	public String getE_id() {
		return e_id;
	}



	/**
	 * @param e_id the e_id to set
	 */
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}



	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}



	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	int log = 0;
String tname;
	public String execute()throws Exception{
		
		Map session=ActionContext.getContext().getSession();
		int a=0;
		// a = (Integer) session.get(u_id);
		
		
		System.out.println(e_id + pass);
		String c = e_id ;
			if (e_id == pass){
				System.out.println("click on home");
				System.out.println(session.get("e_id"));
				System.out.println(session.get("pass"));
				e_id = (String) session.get("e_id") ;
				pass = (String) session.get("pass") ;
				
			}
		
		
		try
		{
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			
			
			
				ResultSet rs=st.executeQuery("select E_ID,U_ID,F_NAME,L_NAME , I_PATH ,B_IMG ,B_SOUND ,COLLAGE , UNIVER ,PH  from reg_tbl where E_ID='"+e_id+"' and PASS='"+pass+"' ");
				/*         ***************************for  lhs start******************************                                    */
				
				while (rs.next())
				{
					if(rs.getString(1).equals(e_id))
					{
					
						 u_id=rs.getInt("U_ID");
						//Map session=ActionContext.getContext().getSession();
						session.put("u_id", u_id);
						session.put("e_id", e_id);
						session.put("un", (rs.getString(3)+rs.getString(4)) );
						session.put("i",rs.getString(5) );
						session.put("bi",rs.getString(6) );
						 ubi = rs.getString("B_IMG");
						session.put("ubi", ubi);
						session.put("bs",rs.getString(7) );
						session.put("cl",rs.getString(8) );
						session.put("uni",rs.getString(9) );
						tname = "A"+ rs.getString("ph");
						
						
						session.put("ph", rs.getString(10) );
						session.put("pass", pass);
					/*	System.out.println("inside user");*/
					 log= 1 ;	
					 
					 
					
					 
					 
					 
					ResultSet rspg=st.executeQuery("select pg_id , name , picture from page_tbl where creater_id = "+ u_id +"    ");
						while(rspg.next()){
							int pi =rspg.getInt("pg_id");
							String name=rspg.getString("name");
							String pict = rspg.getString("picture");
							pglist.add(new rhs_genric(pi,name,pict));
							session.put("pglist", pglist );						
						}
					ResultSet rspoll=st.executeQuery("select poll_id , poll_name  from poll_tbl where creter_id = "+ u_id +"    ");	
						
						while(rspoll.next()){
							int pli=rspoll.getInt("poll_id");
							String pn = rspoll.getString("poll_name");
							polllist.add(new rhs_genric(pli,pn));
							session.put(polllist, "polllist");
						}
						
						/*         ***************************for  lhs end******************************                                    */	
						String t="t";
						
					ResultSet rsfrnd = st.executeQuery("select f_id  from frnd_tbl where u_id = "+ u_id +" and accept = '"+ t +"'  ");	
					
						while(rsfrnd.next()){
							
							int fi = rsfrnd.getInt("f_id");
							flist.add(fi);	
							
								
						}
				
						System.out.println("uid in flist");
						flist.add(u_id);
						System.out.println("uid in flist");
						
						int size= flist.size();
						for(int i=0 ;i<size; i++){
							
							
							/*         ***************************for  rhs start******************************         */                           
							ResultSet rsrhs=st.executeQuery("select I_PATH , L_NAME , F_NAME  from reg_tbl where U_ID = "+ flist.get(i) +"    ");
							while (rsrhs.next()){
							String ip= rsrhs.getString(1);
							String nm = rsrhs.getString(3) + rsrhs.getString(2);
							System.out.println(nm);
							rhslist.add(new rhs_genric((Integer) flist.get(i),nm,ip));
							
							}
							session.put("rhslist",rhslist);
							/*         ***************************for  rhs end******************************       				 */	
							
						}
						
						
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
						
						
						
						System.out.println("1");
						
						
						
						
						for(int i=0 ;i<size; i++){
							//System.out.println("2");
							
						//	st.executeUpdate("insert into " +e_id+ "(pi)  values(" + ("select pro_id  from upld_tbl where uplder_id = "+ flist.get(i) +" ") +"   ");
							
							// st.executeUpdate("insert into " +e_id+ "(pi, pt ,path , uploder ) values(" + ("select pro_id  from upld_tbl where uplder_id = "+ flist.get(i) +" ;") +",'"+("select pro_type  from upld_tbl where uplder_id = "+ flist.get(i) +";")+"' , '" +("select path  from upld_tbl where uplder_id = "+ flist.get(i) +";")+ "' , '"  + ("select F_NAME ,L_NAME  from reg_tbl where u_id = "+ flist.get(i) +";")+ "'  )");
						ResultSet rsfupld = st.executeQuery("select pro_id, pro_type , path  from upld_tbl where uplder_id = "+ flist.get(i) +"    ");
						while (rsfupld.next()){
							int pi= rsfupld.getInt("pro_id");
							api.add(pi);
							String pt= rsfupld.getString("pro_type");
							apt.add(pt);
							String path =rsfupld.getString("path");
							apath.add(path);
							apname.add(flist.get(i));
							//upldlist.add(new pgsearchgenric(pi,pt,path,path));
							//System.out.println(" upld list"+ upldlist);
							System.out.println(pi + pt  + path + path);
							//st.executeUpdate("insert into " +e_id+ "(pi, pt ,path , uploder ) values("+ pi +",'"+pt+"' , '" +path+ "' , '"  + ("select F_NAME ,L_NAME  from reg_tbl where u_id = "+ flist.get(i) +"")+ "'  )");
							// st.executeUpdate("insert into " +e_id+ "(pi, pt ,path , uploder ) values("+ ("select pro_id  from upld_tbl where uplder_id = "+ flist.get(i) +"") +",'"+("select pro_type  from upld_tbl where uplder_id = "+ flist.get(i) +"")+"' , '" +("select path  from upld_tbl where uplder_id = "+ flist.get(i) +"")+ "' , '"  + ("select F_NAME ,L_NAME  from reg_tbl where u_id = "+ flist.get(i) +"")+ "'  )");
							
						}
						//session.put("upldlist",upldlist);
						//System.out.println(upldlist.get(0));
						}
						
						size= api.size();
						System.out.println("size" +  size);
						
						
						 try{
							 
							 st.executeQuery("select *  from "+ tname +" ORDER BY pi DESC    ");
						 }
						 catch (Exception e) {
							 st.executeUpdate("CREATE TABLE "+tname+" (pi int ,pt VARCHAR( 5 ), path VARCHAR( 300 ),uploder VARCHAR( 100 ) ); ");
								System.out.println("table created");
								
								for (int i=0; i<size; i++ ){
									ResultSet rss = st.executeQuery("select F_NAME ,L_NAME  from reg_tbl where u_id = "+ apname.get(i) +"");
									while (rss.next()){
										String tempname =rss.getString(1) + rss.getString(2);
										uploder.add(  tempname  ); 
										
									}
									System.out.println("uploader list added");
								}
								
								
								for (int l =0; l<size;l++){
									String um = (String) apath.get(l);
									System.out.println(" um is :"  + um);
									String es = (String) apt.get(l);
									System.out.println(es);
									int sh = (Integer) api.get(l);
									System.out.println(sh);									
									String uplodere = (String) uploder.get(l);
									System.out.println("first loop over");
									st.executeUpdate("insert into " + tname + "(pi, pt ,path , uploder ) values("+sh +",'"+es+"' , '" +um+ "' , '"+ uplodere  +"'  )");
								}	
								
						}
						 
						
						session.put("apath",apath);
						//System.out.println(api.get(2) + " " + apt.get(2) + " " + apath.get(2));
						
					
					
						
						
						
						
System.out.println("search from dummy table ");
						
						ResultSet rsupld = st.executeQuery("select *  from "+ tname +" ORDER BY pi DESC    ");
							while(rsupld.next()){
								int api = rsupld.getInt("pi");
								String apt = rsupld.getString("pt");
								String apath = rsupld.getString("path");
								String aname= rsupld.getString("uploder");
								upldlist.add(new pgsearchgenric(api,apt,apath,aname));
								System.out.println("upldlist final:"+ upldlist);
							}
						
						
						
						
					//	st.executeUpdate(" DROP TABLE "+tname+"; " );
						
						
						
						
						
						
					ResultSet rsnoti = st.executeQuery("select * from noti_tbl where u_id = "+ u_id +"    ");
						while (rsnoti.next()){
							
							text= rsnoti.getString("text");
							 value=rsnoti.getString("value");
							 pid = rsnoti.getInt("p_id");
							 notilist.add(new rhs_genric(pid, text ,value));
						}
						
						
						session.put("notilist", notilist );
						
						System.out.println("return success from logcheck.jav");
						return SUCCESS;	
					}
		
				}
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		 //st.executeUpdate("update registration_tbl set first_name=' " + edit_name + " ' , last_name=' "+edit_lname+" ' ,address1=' "+address1+" ' ,address2=' "+address2+" ' ,citystate=' "+stateregion+" ' ,zip_code="+zipcode+"  where u_id= "+id+" ");
		
		
		
		return ERROR;
	}



	public List getUploder() {
		return uploder;
	}



	public void setUploder(List uploder) {
		this.uploder = uploder;
	}



	public int getU_id() {
		return u_id;
	}



	public void setU_id(int u_id) {
		this.u_id = u_id;
	}



	public List<rhs_genric> getRhslist() {
		return rhslist;
	}



	public void setRhslist(List<rhs_genric> rhslist) {
		this.rhslist = rhslist;
	}



	public List<rhs_genric> getPglist() {
		return pglist;
	}



	public void setPglist(List<rhs_genric> pglist) {
		this.pglist = pglist;
	}



	public List<rhs_genric> getPolllist() {
		return polllist;
	}



	public void setPolllist(List<rhs_genric> polllist) {
		this.polllist = polllist;
	}



	public List<pgsearchgenric> getUpldlist() {
		return upldlist;
	}



	public void setUpldlist(List<pgsearchgenric> upldlist) {
		this.upldlist = upldlist;
	}



	public List getFlist() {
		return flist;
	}



	public void setFlist(List flist) {
		this.flist = flist;
	}

}



/*
 * 
 * /*         ***************************for  rhs start******************************                                    
								ResultSet rsrhs=st.executeQuery("select I_PATH , L_NAME , F_NAME  from reg_tbl where U_ID = "+ fi +"    ");
								while (rsrhs.next()){
								String ip= rsrhs.getString(1);
								String nm = rsrhs.getString(2) + rsrhs.getString(3);
								
								rhslist.add(new rhs_genric(fi,ip,nm));
								}
								
								/*         ***************************for  rhs end******************************                                    
								
								ResultSet rsfupld = st.executeQuery("select pro_id, pro_type , path  from upld_tbl where uplder_id = "+ fi +"    ");
								while (rsfupld.next()){
									int pi= rsfupld.getInt("pro_id");
									String pt= rsfupld.getString("pro_type");
									String path =rsfupld.getString("path");
								}
								
								
								*/
