import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rta.conne.conne;


public class resultpoll extends ActionSupport {
	
	int aa,ab,ac,ad,ae,af,ag,ah,ai,aj,poll_id,creter_id ;
	String pname;
	public List flist = new ArrayList();
	
	
	public String getPname() {
		return pname;
	}




	public void setPname(String pname) {
		this.pname = pname;
	}




	public int getPoll_id() {
		return poll_id;
	}




	public void setPoll_id(int poll_id) {
		this.poll_id = poll_id;
	}




	public int getCreter_id() {
		return creter_id;
	}




	public void setCreter_id(int creter_id) {
		this.creter_id = creter_id;
	}




	public int getAa() {
		return aa;
	}




	public void setAa(int aa) {
		this.aa = aa;
	}




	public int getAb() {
		return ab;
	}




	public void setAb(int ab) {
		this.ab = ab;
	}




	public int getAc() {
		return ac;
	}




	public void setAc(int ac) {
		this.ac = ac;
	}




	public int getAd() {
		return ad;
	}




	public void setAd(int ad) {
		this.ad = ad;
	}




	public int getAe() {
		return ae;
	}




	public void setAe(int ae) {
		this.ae = ae;
	}




	public int getAf() {
		return af;
	}




	public void setAf(int af) {
		this.af = af;
	}




	public int getAg() {
		return ag;
	}




	public void setAg(int ag) {
		this.ag = ag;
	}




	public int getAh() {
		return ah;
	}




	public void setAh(int ah) {
		this.ah = ah;
	}




	public int getAi() {
		return ai;
	}




	public void setAi(int ai) {
		this.ai = ai;
	}




	public int getAj() {
		return aj;
	}




	public void setAj(int aj) {
		this.aj = aj;
	}




	int ba,bb,bc,bd,be,bf,bg,bh,bi,bj;
	
	int atrue;


	public String execute()throws Exception{
		System.out.println("result poll.java");
		
		 //System.out.println( aa + ab + ac + ad + ae + af + ag + ah + ai + aj);
		
		try{
			
			
		Connection con=conne.GetConnection();
		Statement st=con.createStatement();
		
		Map session=ActionContext.getContext().getSession();
		int a = (Integer) session.get("u_id");
		
		
		
		ResultSet rspoll=st.executeQuery("select * from poll_tbl where poll_id = "+ poll_id +"    ");
		while(rspoll.next()){
			
			ba = rspoll.getInt("o_atrue");
			bb = rspoll.getInt("o_btrue");
			bc = rspoll.getInt("o_ctrue");
			bd = rspoll.getInt("o_dtrue");
			be = rspoll.getInt("o_etrue");
			bf = rspoll.getInt("o_ftrue");
			bg = rspoll.getInt("o_gtrue");
			bh = rspoll.getInt("o_htrue");
			bi = rspoll.getInt("o_itrue");
			bj = rspoll.getInt("o_jtrue");
			
			
		}
		
		if(aa == ba){
			atrue = atrue + 1;
		}
		
		if(ab == bb){
			atrue = atrue + 1;
		}
		
		if(ac == bc){
			atrue = atrue + 1;
		}
		
		if(ad == bd){
			atrue = atrue + 1;
		}
		
		if(ae == be){
			atrue = atrue + 1;
		}
		
		if(af == bf){
			atrue = atrue + 1;
		}
		
		if(ag == bg){
			atrue = atrue + 1;
		}
		
		if(ah == bh){
			atrue = atrue + 1;
		}
		
		if(ai == bi){
			atrue = atrue + 1;
		}
		
		if(aj == bj){
			atrue = atrue + 1;
		}
		
		
		System.out.println(atrue);
		
		
		 st.executeUpdate("insert into playpoll_tbl values( "+poll_id+" ,"+ a + " ,"+ atrue+" )");
		
		
			
		 
		 
			
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
					
					
					System.out.println("bselect page id");
					////////////////////////////////insert in notification taable////////////////////////
					
					
					String text ="your friend" + session.get("un") +  " play poll " + pname  ;
					String value= "play";
					int size= flist.size();
					for(int i=0 ;i<size; i++){
						
						st.executeUpdate("insert into noti_tbl(u_id, text ,value ,p_id ) values("+ flist.get(i) +",'"+text+"','"+ value +"',"+poll_id+") ");
						
					}
					
					
					
		 
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return SUCCESS;
	}




	public int getBa() {
		return ba;
	}




	public void setBa(int ba) {
		this.ba = ba;
	}




	public int getBb() {
		return bb;
	}




	public void setBb(int bb) {
		this.bb = bb;
	}




	public int getBc() {
		return bc;
	}




	public void setBc(int bc) {
		this.bc = bc;
	}




	public int getBd() {
		return bd;
	}




	public void setBd(int bd) {
		this.bd = bd;
	}




	public int getBe() {
		return be;
	}




	public void setBe(int be) {
		this.be = be;
	}




	public int getBf() {
		return bf;
	}




	public void setBf(int bf) {
		this.bf = bf;
	}




	public int getBg() {
		return bg;
	}




	public void setBg(int bg) {
		this.bg = bg;
	}




	public int getBh() {
		return bh;
	}




	public void setBh(int bh) {
		this.bh = bh;
	}




	public int getBi() {
		return bi;
	}




	public void setBi(int bi) {
		this.bi = bi;
	}




	public int getBj() {
		return bj;
	}




	public void setBj(int bj) {
		this.bj = bj;
	}




	public int getAtrue() {
		return atrue;
	}




	public void setAtrue(int atrue) {
		this.atrue = atrue;
	}

}
