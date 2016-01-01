import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;




public class noti extends ActionSupport{
	String tt ,vv;
	int id;

		public String getTt() {
		return tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public String getVv() {
		return vv;
	}

	public void setVv(String vv) {
		this.vv = vv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		public String execute(){
			System.out.println("qweryu   ");
			
			System.out.println(vv);
			String b= vv ;
			String comp = "play";
			System.out.println("hi out of loop" + b + comp);
			
			
			if(b.equals("Add Friend")){
				Map session=ActionContext.getContext().getSession();
				int u_id =  (Integer) session.get("u_id");
				
				System.out.println("friend request accept call");
				
				try{
					
					Connection con=conne.GetConnection();
					Statement st=con.createStatement();
					
					String t="t";
					st.executeUpdate(" insert into frnd_tbl values("+u_id+" , "+ id+" , '"+ t +"' ) ");
					
					
					st.executeUpdate("update frnd_tbl set accept=' " + t + " '   where u_id= "+id+" and f_id = "+ u_id +"  ");
					
					System.out.println(id + "id -uid" +u_id );
					
					System.out.println("before delete");
					st.executeUpdate("delete  from noti_tbl where u_id="+ u_id +" and p_id ="+ id +" ");
					System.out.println("after delete");
					
					
					String val ="Add Friend";
					int p_id =  (Integer) session.get("u_id");
					String txt ="want to become your friend";
					
					//st.executeUpdate(" insert into noti_tbl(u_id , text ,value , p_id) values('"+id+"' ,'" + txt+"' , '"+ val+"', "+ u_id +" ) ");
					
					}
					catch (Exception e) {
						System.out.println(e);
					}
			}
			
			if (b.equals(comp)){
				
				System.out.println("this is play");
				
				try{
					
					
					Connection con=conne.GetConnection();
					Statement st=con.createStatement();
					
					
					//ResultSet rs=st.executeQuery("select pr_id,u_id,product_name,product_category,product_company,start_price,product_details,img_name from  product_upload_tbl");
					ResultSet rs=st.executeQuery("select poll_id, creter_id, poll_name, poll_type, diff_level, qa, o_aa, o_ab, o_ac, o_ad, o_atrue, qb, o_ba, o_bb, o_bc, o_bd, o_btrue, qc, o_ca, o_cb, o_cc, o_cd, o_ctrue, qd, o_da, o_db, o_dc, o_dd, o_dtrue, qe, o_ea, o_eb, o_ec, o_ed, o_etrue, qf, o_fa, o_fb, o_fc, o_fd, o_ftrue, qg, o_ga, o_gb, o_gc, o_gd, o_gtrue, qh, o_ha, o_hb, o_hc, o_hd, o_htrue, qi, o_ia, o_ib, o_ic, o_id, o_itrue, qj, o_ja, o_jb, o_jc, o_jd, o_jtrue from poll_tbl where poll_id= "+ id+" ");
						while(rs.next()){
							int poll_id=rs.getInt("poll_id");
							int creter_id=rs.getInt("creter_id");
							String  poll_name=rs.getString("poll_name");
							System.out.println("sdsdcsadc sd" + poll_name);
							int poll_type=rs.getInt("poll_type");
							
							int diff_level=rs.getInt("diff_level");
							
							
							String qa=rs.getString("qa");
							String o_aa=rs.getString("o_aa");
							String o_ab=rs.getString("o_ab");
							String o_ac=rs.getString("o_ac");
							String o_ad  =rs.getString("o_ad");	int o_atrue=rs.getInt("o_atrue");
							String qb=rs.getString("qb");
							String  o_ba=rs.getString("o_ba");
							String o_bb=rs.getString("o_bb");
							String o_bc=rs.getString("o_bc");
							String o_bd =rs.getString("o_bd");	int o_btrue =rs.getInt("o_btrue");
							String qc=rs.getString("qc");
							String o_ca=rs.getString("o_ca");
							String o_cb=rs.getString("o_cb");
							String o_cc=rs.getString("o_cc");
							String o_cd =rs.getString("o_cd");	int o_ctrue=rs.getInt("o_ctrue");
							String qd=rs.getString("qd");
							String o_da=rs.getString("o_da");
							String o_db=rs.getString("o_db");
							String o_dc=rs.getString("o_dc");
							String o_dd =rs.getString("o_dd");	int o_dtrue=rs.getInt("o_dtrue");
							String qe=rs.getString("qe");
							String o_ea=rs.getString("o_ea");
							String o_eb=rs.getString("o_eb");
							String o_ec=rs.getString("o_ec");
							String o_ed =rs.getString("o_ed");	int o_etrue=rs.getInt("o_etrue");
							String qf=rs.getString("qf");
							String o_fa=rs.getString("o_fa");
							String o_fb=rs.getString("o_fb");
							String o_fc=rs.getString("o_fc");
							String o_fd =rs.getString("o_fd");	int o_ftrue=rs.getInt("o_ftrue");
							String qg=rs.getString("qg");
							String o_ga=rs.getString("o_ga");
							String o_gb=rs.getString("o_gb");
							String o_gc=rs.getString("o_gc");
							String o_gd =rs.getString("o_gd");	int o_gtrue =rs.getInt("o_gtrue");
							String qh=rs.getString("qh");
							String o_ha=rs.getString("o_ha");
							String o_hb=rs.getString("o_hb");
							String o_hc=rs.getString("o_hc");
							String o_hd =rs.getString("o_hd");int o_htrue=rs.getInt("o_htrue");
							String qi=rs.getString("qi");
							String o_ia=rs.getString("o_ia");
							String o_ib=rs.getString("o_ib");
							String o_ic=rs.getString("o_ic");
							String o_id =rs.getString("o_id");	int o_itrue=rs.getInt("o_itrue");
							String qj=rs.getString("qj");
							String o_ja=rs.getString("o_ja");
							String o_jb=rs.getString("o_jb");
							String o_jc=rs.getString("o_jc");
							String o_jd =rs.getString("o_jd");
							int o_jtrue=rs.getInt("o_jtrue");
							System.out.println( poll_id+ creter_id + poll_name + poll_type + diff_level + qa + o_aa + o_ab + o_ac + o_ad + o_atrue+  qb+ o_ba+ o_bb + o_bc + o_bd + o_btrue + qc + o_ca + o_cb + o_cc + o_cd + o_ctrue +  qd + o_da + o_db + o_dc + o_dd + o_dtrue + qe + o_ea + o_eb + o_ec + o_ed + o_etrue + qf + o_fa + o_fb+ o_fc + o_fd + o_ftrue + qg + o_ga + o_gb + o_gc + o_gd + o_gtrue + qh + o_ha+  o_hb + o_hc + o_hd + o_htrue + qi + o_ia + o_ib +  o_ic + o_id + o_itrue + qj + o_ja + o_jb + o_jc + o_jd + o_jtrue);
							String pname=poll_name;
							
							Map session_poll=ActionContext.getContext().getSession();
							session_poll.put("creter_id", creter_id);
							session_poll.put("poll_id",poll_id );
							session_poll.put("pname", pname);
							session_poll.put("ptype", poll_type);
							session_poll.put("diff_level",diff_level);
							session_poll.put("qa", qa);
							session_poll.put("qb",qb);
							session_poll.put("qc",qc);
							session_poll.put("qd",qd);
							session_poll.put("qe",qe);
							session_poll.put("qf",qf);
							session_poll.put("qg",qg);
							session_poll.put("qh",qh);
							session_poll.put("qi",qi);
							session_poll.put("qj",qj);
							session_poll.put("o_aa",o_aa);
							session_poll.put("o_ab",o_ab);
							session_poll.put("o_ac",o_ac);
							session_poll.put("o_ad",o_ad);
							session_poll.put("o_ba",o_ba);
							session_poll.put("o_bb",o_bb);
							session_poll.put("o_bc",o_bc);
							session_poll.put("o_bd",o_bd);
							session_poll.put("o_ca",o_ca);
							session_poll.put("o_cb",o_cb);
							session_poll.put("o_cc",o_cc);
							session_poll.put("o_cd",o_cd);
							session_poll.put("o_da",o_da);
							session_poll.put("o_db",o_db);
							session_poll.put("o_dc",o_dc);
							session_poll.put("o_dd",o_dd);
							session_poll.put("o_ea",o_ea);
							session_poll.put("o_eb",o_eb);
							session_poll.put("o_ec",o_ec);
							session_poll.put("o_ed",o_ed);
							session_poll.put("o_fa",o_fa);
							session_poll.put("o_fb",o_fb);
							session_poll.put("o_fc",o_fc);
							session_poll.put("o_fd",o_fd);
							session_poll.put("o_ga",o_ga);
							session_poll.put("o_gb",o_gb);
							session_poll.put("o_gc",o_gc);
							session_poll.put("o_gd",o_gd);
							session_poll.put("o_ha",o_ha);
							session_poll.put("o_hb",o_hb);
							session_poll.put("o_hc",o_hc);
							session_poll.put("o_hd",o_hd);
							session_poll.put("o_ia",o_ia);
							session_poll.put("o_ib",o_ib);
							session_poll.put("o_ic",o_ic);
							session_poll.put("o_id",o_id);
							session_poll.put("o_ja",o_ja);
							session_poll.put("o_jb",o_jb);
							session_poll.put("o_jc",o_jc);
							session_poll.put("o_jd",o_jd);
							session_poll.put("o_atrue",o_atrue);
							session_poll.put("o_btrue",o_btrue);
							session_poll.put("o_ctrue",o_ctrue);
							session_poll.put("o_dtrue",o_dtrue);
							session_poll.put("o_etrue",o_etrue);
							session_poll.put("o_ftrue",o_ftrue);
							session_poll.put("o_gtrue",o_gtrue);
							session_poll.put("o_htrue",o_htrue);
							session_poll.put("o_itrue",o_itrue);
							session_poll.put("o_jtrue",o_jtrue);
							System.out.println(pname);
						}
					
					
					}
					catch (Exception e) {
						// TODO: handle exception
						System.out.println("exception is:" + e);
					}
					return INPUT;
					
			}
			
			if(b.equals("show")){
				System.out.println("this is show");
				
				
				
				try
				{
					Connection con=conne.GetConnection();
					Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from page_tbl where pg_id="+ id +" ");
				
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
						
						
						int uid = (Integer) session.get("u_id");
						System.out.println(  uid  );
					}
					return ERROR;
				}
				catch (Exception e) {
						System.out.println(e);
				}
				
			}
			return SUCCESS;
		}
	
}
