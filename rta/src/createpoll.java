import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import com.rta.conne.*;


public class createpoll extends ActionSupport {
	String  pname; 
	String q1 ,q2 ,q3 ,q4, q5 ,q6 ,q7 ,q8 ,q9 ,q10;
	String aa ,ba ,ca, da, ea, fa, ga, ha ,ia, ja ;
	String ab ,bb ,cb, db ,eb, fb, gb, hb, ib , jb;
	String ac ,bc ,cc ,dc ,ec ,fc, gc, hc ,ic,  jc;
	String ad ,bd,cd,  dd, ed, fd, gd, hd, id,  jd;
	int aans ,bans ,cans, dans, eans ,fans, gans, hans, ians, jans, ptype ,poll_id ,creater_id =44 ,difficulty;
	public List flist = new ArrayList();
	
	
	
	

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}
	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	/**
	 * @return the q1
	 */
	public String getQ1() {
		return q1;
	}
	/**
	 * @param q1 the q1 to set
	 */
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	/**
	 * @return the q2
	 */
	public String getQ2() {
		return q2;
	}
	/**
	 * @param q2 the q2 to set
	 */
	public void setQ2(String q2) {
		this.q2 = q2;
	}
	/**
	 * @return the q3
	 */
	public String getQ3() {
		return q3;
	}
	/**
	 * @param q3 the q3 to set
	 */
	public void setQ3(String q3) {
		this.q3 = q3;
	}
	/**
	 * @return the q4
	 */
	public String getQ4() {
		return q4;
	}
	/**
	 * @param q4 the q4 to set
	 */
	public void setQ4(String q4) {
		this.q4 = q4;
	}
	/**
	 * @return the q5
	 */
	public String getQ5() {
		return q5;
	}
	/**
	 * @param q5 the q5 to set
	 */
	public void setQ5(String q5) {
		this.q5 = q5;
	}
	/**
	 * @return the q6
	 */
	public String getQ6() {
		return q6;
	}
	/**
	 * @param q6 the q6 to set
	 */
	public void setQ6(String q6) {
		this.q6 = q6;
	}
	/**
	 * @return the q7
	 */
	public String getQ7() {
		return q7;
	}
	/**
	 * @param q7 the q7 to set
	 */
	public void setQ7(String q7) {
		this.q7 = q7;
	}
	/**
	 * @return the q8
	 */
	public String getQ8() {
		return q8;
	}
	/**
	 * @param q8 the q8 to set
	 */
	public void setQ8(String q8) {
		this.q8 = q8;
	}
	/**
	 * @return the q9
	 */
	public String getQ9() {
		return q9;
	}
	/**
	 * @param q9 the q9 to set
	 */
	public void setQ9(String q9) {
		this.q9 = q9;
	}
	/**
	 * @return the q10
	 */
	public String getQ10() {
		return q10;
	}
	/**
	 * @param q10 the q10 to set
	 */
	public void setQ10(String q10) {
		this.q10 = q10;
	}
	/**
	 * @return the aa
	 */
	public String getAa() {
		return aa;
	}
	/**
	 * @param aa the aa to set
	 */
	public void setAa(String aa) {
		this.aa = aa;
	}
	/**
	 * @return the ba
	 */
	public String getBa() {
		return ba;
	}
	/**
	 * @param ba the ba to set
	 */
	public void setBa(String ba) {
		this.ba = ba;
	}
	/**
	 * @return the ca
	 */
	public String getCa() {
		return ca;
	}
	/**
	 * @param ca the ca to set
	 */
	public void setCa(String ca) {
		this.ca = ca;
	}
	/**
	 * @return the da
	 */
	public String getDa() {
		return da;
	}
	/**
	 * @param da the da to set
	 */
	public void setDa(String da) {
		this.da = da;
	}
	/**
	 * @return the ea
	 */
	public String getEa() {
		return ea;
	}
	/**
	 * @param ea the ea to set
	 */
	public void setEa(String ea) {
		this.ea = ea;
	}
	/**
	 * @return the fa
	 */
	public String getFa() {
		return fa;
	}
	/**
	 * @param fa the fa to set
	 */
	public void setFa(String fa) {
		this.fa = fa;
	}
	/**
	 * @return the ga
	 */
	public String getGa() {
		return ga;
	}
	/**
	 * @param ga the ga to set
	 */
	public void setGa(String ga) {
		this.ga = ga;
	}
	/**
	 * @return the ha
	 */
	public String getHa() {
		return ha;
	}
	/**
	 * @param ha the ha to set
	 */
	public void setHa(String ha) {
		this.ha = ha;
	}
	/**
	 * @return the ia
	 */
	public String getIa() {
		return ia;
	}
	/**
	 * @param ia the ia to set
	 */
	public void setIa(String ia) {
		this.ia = ia;
	}
	/**
	 * @return the ja
	 */
	public String getJa() {
		return ja;
	}
	/**
	 * @param ja the ja to set
	 */
	public void setJa(String ja) {
		this.ja = ja;
	}
	/**
	 * @return the ab
	 */
	public String getAb() {
		return ab;
	}
	/**
	 * @param ab the ab to set
	 */
	public void setAb(String ab) {
		this.ab = ab;
	}
	/**
	 * @return the bb
	 */
	public String getBb() {
		return bb;
	}
	/**
	 * @param bb the bb to set
	 */
	public void setBb(String bb) {
		this.bb = bb;
	}
	/**
	 * @return the cb
	 */
	public String getCb() {
		return cb;
	}
	/**
	 * @param cb the cb to set
	 */
	public void setCb(String cb) {
		this.cb = cb;
	}
	/**
	 * @return the db
	 */
	public String getDb() {
		return db;
	}
	/**
	 * @param db the db to set
	 */
	public void setDb(String db) {
		this.db = db;
	}
	/**
	 * @return the eb
	 */
	public String getEb() {
		return eb;
	}
	/**
	 * @param eb the eb to set
	 */
	public void setEb(String eb) {
		this.eb = eb;
	}
	/**
	 * @return the fb
	 */
	public String getFb() {
		return fb;
	}
	/**
	 * @param fb the fb to set
	 */
	public void setFb(String fb) {
		this.fb = fb;
	}
	/**
	 * @return the gb
	 */
	public String getGb() {
		return gb;
	}
	/**
	 * @param gb the gb to set
	 */
	public void setGb(String gb) {
		this.gb = gb;
	}
	/**
	 * @return the hb
	 */
	public String getHb() {
		return hb;
	}
	/**
	 * @param hb the hb to set
	 */
	public void setHb(String hb) {
		this.hb = hb;
	}
	/**
	 * @return the ib
	 */
	public String getIb() {
		return ib;
	}
	/**
	 * @param ib the ib to set
	 */
	public void setIb(String ib) {
		this.ib = ib;
	}
	/**
	 * @return the jb
	 */
	public String getJb() {
		return jb;
	}
	/**
	 * @param jb the jb to set
	 */
	public void setJb(String jb) {
		this.jb = jb;
	}
	/**
	 * @return the ac
	 */
	public String getAc() {
		return ac;
	}
	/**
	 * @param ac the ac to set
	 */
	public void setAc(String ac) {
		this.ac = ac;
	}
	/**
	 * @return the bc
	 */
	public String getBc() {
		return bc;
	}
	/**
	 * @param bc the bc to set
	 */
	public void setBc(String bc) {
		this.bc = bc;
	}
	/**
	 * @return the cc
	 */
	public String getCc() {
		return cc;
	}
	/**
	 * @param cc the cc to set
	 */
	public void setCc(String cc) {
		this.cc = cc;
	}
	/**
	 * @return the dc
	 */
	public String getDc() {
		return dc;
	}
	/**
	 * @param dc the dc to set
	 */
	public void setDc(String dc) {
		this.dc = dc;
	}
	/**
	 * @return the ec
	 */
	public String getEc() {
		return ec;
	}
	/**
	 * @param ec the ec to set
	 */
	public void setEc(String ec) {
		this.ec = ec;
	}
	/**
	 * @return the fc
	 */
	public String getFc() {
		return fc;
	}
	/**
	 * @param fc the fc to set
	 */
	public void setFc(String fc) {
		this.fc = fc;
	}
	/**
	 * @return the gc
	 */
	public String getGc() {
		return gc;
	}
	/**
	 * @param gc the gc to set
	 */
	public void setGc(String gc) {
		this.gc = gc;
	}
	/**
	 * @return the hc
	 */
	public String getHc() {
		return hc;
	}
	/**
	 * @param hc the hc to set
	 */
	public void setHc(String hc) {
		this.hc = hc;
	}
	/**
	 * @return the ic
	 */
	public String getIc() {
		return ic;
	}
	/**
	 * @param ic the ic to set
	 */
	public void setIc(String ic) {
		this.ic = ic;
	}
	/**
	 * @return the jc
	 */
	public String getJc() {
		return jc;
	}
	/**
	 * @param jc the jc to set
	 */
	public void setJc(String jc) {
		this.jc = jc;
	}
	/**
	 * @return the ad
	 */
	public String getAd() {
		return ad;
	}
	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}
	/**
	 * @return the bd
	 */
	public String getBd() {
		return bd;
	}
	/**
	 * @param bd the bd to set
	 */
	public void setBd(String bd) {
		this.bd = bd;
	}
	/**
	 * @return the cd
	 */
	public String getCd() {
		return cd;
	}
	/**
	 * @param cd the cd to set
	 */
	public void setCd(String cd) {
		this.cd = cd;
	}
	/**
	 * @return the dd
	 */
	public String getDd() {
		return dd;
	}
	/**
	 * @param dd the dd to set
	 */
	public void setDd(String dd) {
		this.dd = dd;
	}
	/**
	 * @return the ed
	 */
	public String getEd() {
		return ed;
	}
	/**
	 * @param ed the ed to set
	 */
	public void setEd(String ed) {
		this.ed = ed;
	}
	/**
	 * @return the fd
	 */
	public String getFd() {
		return fd;
	}
	/**
	 * @param fd the fd to set
	 */
	public void setFd(String fd) {
		this.fd = fd;
	}
	/**
	 * @return the gd
	 */
	public String getGd() {
		return gd;
	}
	/**
	 * @param gd the gd to set
	 */
	public void setGd(String gd) {
		this.gd = gd;
	}
	/**
	 * @return the hd
	 */
	public String getHd() {
		return hd;
	}
	/**
	 * @param hd the hd to set
	 */
	public void setHd(String hd) {
		this.hd = hd;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the jd
	 */
	public String getJd() {
		return jd;
	}
	/**
	 * @param jd the jd to set
	 */
	public void setJd(String jd) {
		this.jd = jd;
	}
	/**
	 * @return the aans
	 */
	public int getAans() {
		return aans;
	}
	/**
	 * @param aans the aans to set
	 */
	public void setAans(int aans) {
		this.aans = aans;
	}
	/**
	 * @return the bans
	 */
	public int getBans() {
		return bans;
	}
	/**
	 * @param bans the bans to set
	 */
	public void setBans(int bans) {
		this.bans = bans;
	}
	/**
	 * @return the cans
	 */
	public int getCans() {
		return cans;
	}
	/**
	 * @param cans the cans to set
	 */
	public void setCans(int cans) {
		this.cans = cans;
	}
	/**
	 * @return the dans
	 */
	public int getDans() {
		return dans;
	}
	/**
	 * @param dans the dans to set
	 */
	public void setDans(int dans) {
		this.dans = dans;
	}
	/**
	 * @return the eans
	 */
	public int getEans() {
		return eans;
	}
	/**
	 * @param eans the eans to set
	 */
	public void setEans(int eans) {
		this.eans = eans;
	}
	/**
	 * @return the fans
	 */
	public int getFans() {
		return fans;
	}
	/**
	 * @param fans the fans to set
	 */
	public void setFans(int fans) {
		this.fans = fans;
	}
	/**
	 * @return the gans
	 */
	public int getGans() {
		return gans;
	}
	/**
	 * @param gans the gans to set
	 */
	public void setGans(int gans) {
		this.gans = gans;
	}
	/**
	 * @return the hans
	 */
	public int getHans() {
		return hans;
	}
	/**
	 * @param hans the hans to set
	 */
	public void setHans(int hans) {
		this.hans = hans;
	}
	/**
	 * @return the ians
	 */
	public int getIans() {
		return ians;
	}
	/**
	 * @param ians the ians to set
	 */
	public void setIans(int ians) {
		this.ians = ians;
	}
	/**
	 * @return the jans
	 */
	public int getJans() {
		return jans;
	}
	/**
	 * @param jans the jans to set
	 */
	public void setJans(int jans) {
		this.jans = jans;
	}
	/**
	 * @return the ptype
	 */
	public int getPtype() {
		return ptype;
	}
	/**
	 * @param ptype the ptype to set
	 */
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	/**
	 * @return the poll_id
	 */
	public int getPoll_id() {
		return poll_id;
	}
	/**
	 * @param poll_id the poll_id to set
	 */
	public void setPoll_id(int poll_id) {
		this.poll_id = poll_id;
	}
	/**
	 * @return the creater_id
	 */
	public int getCreater_id() {
		return creater_id;
	}
	/**
	 * @param creater_id the creater_id to set
	 */
	public void setCreater_id(int creater_id) {
		this.creater_id = creater_id;
	}

	public String execute()throws Exception{
		System.out.println(" name is:"+pname  ); 
		System.out.println("create poll.java");
		Connection con=conne.GetConnection();
		Statement st=con.createStatement();
		//st.executeUpdate("insert into image(path,name) values('"+sname+"','"+name+"')");
		
		Map session=ActionContext.getContext().getSession();
		int a = (Integer) session.get("u_id");
		
		st.executeUpdate("insert into poll_tbl( creter_id, poll_name, poll_type, diff_level, qa, o_aa, o_ab, o_ac, o_ad, o_atrue, qb, o_ba, o_bb, o_bc, o_bd, o_btrue, qc, o_ca, o_cb, o_cc, o_cd, o_ctrue, qd, o_da, o_db, o_dc, o_dd, o_dtrue, qe, o_ea, o_eb, o_ec, o_ed, o_etrue, qf, o_fa, o_fb, o_fc, o_fd, o_ftrue, qg, o_ga, o_gb, o_gc, o_gd, o_gtrue, qh, o_ha, o_hb, o_hc, o_hd, o_htrue, qi, o_ia, o_ib, o_ic, o_id, o_itrue, qj, o_ja, o_jb, o_jc, o_jd, o_jtrue) values("+a+",'"+pname+"',"+ptype+","+difficulty+",'"+q1+"','"+aa+"','"+ab+"','"+ac+"','"+ad+"',"+aans+" ,'"+q2+"','"+ba+"','"+bb+"','"+bc+"','"+bd+"',"+bans+",'"+q3+"','"+ca+"','"+cb+"','"+cc+"','"+cd+"',"+cans+",'"+q4+"','"+da+"','"+db+"','"+dc+"','"+dd+"',"+dans+",'"+q5+"','"+ea+"','"+eb+"','"+ec+"','"+ed+"',"+eans+",'"+q6+"','"+fa+"','"+fb+"','"+fc+"','"+fd+"',"+fans+",'"+q7+"','"+ga+"','"+gb+"','"+gc+"','"+gd+"',"+gans+",'"+q8+"','"+ha+"','"+hb+"','"+hc+"','"+hd+"',"+hans+",'"+q9+"','"+ia+"','"+ib+"','"+ic+"','"+id+"',"+ians+",'"+q10+"','"+ja+"','"+jb+"','"+jc+"','"+jd+"',"+jans+" )");
		//(poll_id, creter_id, poll_name, poll_type, diff_level, qa, o_aa, o_ab, o_ac, o_ad, o_atrue, qb, o_ba, o_bb, o_bc, o_bd, o_btrue, qc, o_ca, o_cb, o_cc, o_cd, o_ctrue, qd, o_da, o_db, o_dc, o_dd, o_dtrue, qe, o_ea, o_eb, o_ec, o_ed, o_etrue, qf, o_fa, o_fb, o_fc, o_fd, o_ftrue, qg, o_ga, o_gb, o_gc, o_gd, o_gtrue, qh, o_ha, o_hb, o_hc, o_hd, o_htrue, qi, o_ia, o_ib, o_ic, o_id, o_itrue, qj, o_ja, o_jb, o_jc, o_jd, o_jtrue)
		
		
		
		
		
		
		
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
			ResultSet rsa= st.executeQuery("select * from poll_tbl where creter_id = "+ a +"  ");
			List ls =  new ArrayList();
			while(rsa.next()){
				int temp = rsa.getInt("poll_id");
				System.out.println(temp);
				ls.add(temp);
			}
			
			
			int p_id = (Integer) ls.get(ls.size()-1);
			
			System.out.println("bselect poll id");
			////////////////////////////////insert in notification taable////////////////////////
			
			
			String text ="your friend" + session.get("un") +  " create new poll" + pname;
			String value= "play";
			int size= flist.size();
			for(int i=0 ;i<size; i++){
				
				st.executeUpdate("insert into noti_tbl(u_id, text ,value ,p_id ) values("+ flist.get(i) +",'"+text+"','"+ value +"',"+p_id+") ");
				
			}
		
		
		
		return SUCCESS;
	}
	
}
