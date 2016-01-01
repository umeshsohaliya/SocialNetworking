import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.apache.commons.fileupload.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;

import com.rta.conne.*;

public class dtb extends ActionSupport {
	
		/* it is call on sign up process    */
	
	/*
	 *
	 *
	 *	
		
	 * 	genreate gatter/setter and retrive value from jsp
	 * 
	 * 
	 * set in session
	 * int u_id=rs.getInt("u_id");
					Map session=ActionContext.getContext().getSession();
					session.put("u_id", u_id);
	 * 
	 * remove from session
	 * Map session=ActionContext.getContext().getSession();
		session.remove("username");
	 * 
	 */
	
	String   firstname;
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}


	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}


	String   lastname;


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	String sex;
	String	emailusr;
	String	phonenumber;
	String  status;
	String dob;
	
	
	String	passwordusr;
	public String getPasswordusr() {
		return passwordusr;
	}


	public void setPasswordusr(String passwordusr) {
		this.passwordusr = passwordusr;
	}


	public String getImagefilename() {
		return imagefilename;
	}


	public void setImagefilename(String imagefilename) {
		this.imagefilename = imagefilename;
	}


	String	r_pass;
	String	securityqid;
	String	securityqans;
	

	String country;
	String state;
	String dist;
	String city;
	String address;
	int postcode;

	String school;
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}


	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}


	/**
	 * @return the emailusr
	 */
	public String getEmailusr() {
		return emailusr;
	}


	/**
	 * @param emailusr the emailusr to set
	 */
	public void setEmailusr(String emailusr) {
		this.emailusr = emailusr;
	}


	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}


	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	



	/**
	 * @return the r_pass
	 */
	public String getR_pass() {
		return r_pass;
	}


	/**
	 * @param r_pass the r_pass to set
	 */
	public void setR_pass(String r_pass) {
		this.r_pass = r_pass;
	}


	/**
	 * @return the securityqid
	 */
	public String getSecurityqid() {
		return securityqid;
	}


	/**
	 * @param securityqid the securityqid to set
	 */
	public void setSecurityqid(String securityqid) {
		this.securityqid = securityqid;
	}


	/**
	 * @return the securityqans
	 */
	public String getSecurityqans() {
		return securityqans;
	}


	/**
	 * @param securityqans the securityqans to set
	 */
	public void setSecurityqans(String securityqans) {
		this.securityqans = securityqans;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the dist
	 */
	public String getDist() {
		return dist;
	}


	/**
	 * @param dist the dist to set
	 */
	public void setDist(String dist) {
		this.dist = dist;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the postcode
	 */
	public int getPostcode() {
		return postcode;
	}


	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}


	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}


	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}


	/**
	 * @return the collage
	 */
	public String getCollage() {
		return collage;
	}


	/**
	 * @param collage the collage to set
	 */
	public void setCollage(String collage) {
		this.collage = collage;
	}


	/**
	 * @return the uni
	 */
	public String getUni() {
		return uni;
	}


	/**
	 * @param uni the uni to set
	 */
	public void setUni(String uni) {
		this.uni = uni;
	}


	/**
	 * @return the work
	 */
	public String getWork() {
		return work;
	}


	/**
	 * @param work the work to set
	 */
	public void setWork(String work) {
		this.work = work;
	}


	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}


	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}


	/**
	 * @return the gm
	 */
	public String getGm() {
		return gm;
	}


	/**
	 * @param gm the gm to set
	 */
	public void setGm(String gm) {
		this.gm = gm;
	}


	/**
	 * @return the mv
	 */
	public String getMv() {
		return mv;
	}


	/**
	 * @param mv the mv to set
	 */
	public void setMv(String mv) {
		this.mv = mv;
	}


	/**
	 * @return the sng
	 */
	public String getSng() {
		return sng;
	}


	/**
	 * @param sng the sng to set
	 */
	public void setSng(String sng) {
		this.sng = sng;
	}


	/**
	 * @return the book
	 */
	public String getBook() {
		return book;
	}


	/**
	 * @param book the book to set
	 */
	public void setBook(String book) {
		this.book = book;
	}


	/**
	 * @return the sent
	 */
	public String getSent() {
		return sent;
	}


	/**
	 * @param sent the sent to set
	 */
	public void setSent(String sent) {
		this.sent = sent;
	}


	/**
	 * @return the idl
	 */
	public String getIdl() {
		return idl;
	}


	/**
	 * @param idl the idl to set
	 */
	public void setIdl(String idl) {
		this.idl = idl;
	}

/*
	
	
	
	public File getB_sund() {
		return b_sund;
	}


	
	public void setB_sund(File b_sund) {
		this.b_sund = b_sund;
	}

	
	public File getI_path() {
		return i_path;
	}


	
	public void setI_path(File i_path) {
		this.i_path = i_path;
	}
	
	public File getBimg() {
		return bimg;
	}


	
	public void setBimg(File bimg) {
		this.bimg = bimg;
	}


*/
	String collage;
	String uni;
	String work;
	String lang;

	String gm;
	String mv;
	String sng;
	String book;
	String sent;
	String idl;

	File bimg;
	File b_sund;
	private File imagefile;
	public File getImagefile() {
		return imagefile;
	}


	public void setImagefile(File imagefile) {
		this.imagefile = imagefile;
	}


	private String imagefilename;

	
	


	public String execute()throws Exception{
		
		try{
			 System.out.println(imagefile.getName()); 
			System.out.println(imagefilename);
			System.out.println("dtb");
			System.out.println("postcode is " + postcode);
			System.out.println( "value from registration.jsp is:" + firstname		+			lastname +  postcode +"sx" + securityqid);
			//String sourceFilePath = bimg.getAbsolutePath();
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			//st.executeUpdate("insert into image(path,name) values('"+sname+"','"+name+"')");
		//	st.executeUpdate("insert into reg_tbl(F_NAME,	L_NAME,	SEX,E_ID,PH,DOB,STATUS,PASS,SEQNO,SEQANS,COUN,STAT,DIST,CITY,ADDR,P_CODE,SCHOOL,COLLAGE,UNIVER,	WORK,LANG,F_MV,	F_SNG,F_BOOK,SENTENCE,IDLE,B_IMG,B_SOUND,I_PATH,GAME) values('"+firstname+"','"+lastname+"','"+sex+"','"+emailusr+"',"+phonenumber+",'"+dob+"','"+status+"','"+passwordusrl+"',"+securityqid+" , '"+securityqans+"' , '"+country+"' , ' " + state+"' , '"+dist+"' , '"+city+"' , '"+address+"' , "+postcode+",'"+school+"','"+collage+"','"+uni+"','"+work+"','"+lang+"','"+mv+"','"+sng+"','"+book+"','"+sent+"','"+idl+"','"+bimg+"','"+b_sund+"','"+imagefile+"','"+gm+"')");
			
			ResultSet rs= st.executeQuery("select * from reg_tbl");
			List ls =  new ArrayList();
			while(rs.next()){
				int a = rs.getInt("U_ID");
				System.out.println(a);
				ls.add(a);
			}
			int name = (Integer) ls.get(ls.size()-1) +1 ;
			
			
			System.out.println(name);
			
			
			Map session=ActionContext.getContext().getSession();
			session.put("pc", postcode);
			session.put("fname", firstname);
			
			
			
			
			String imgname ="umesh";
			String sourceFilePath = imagefile.getAbsolutePath();
			/*System.out.println(sourceFilePath);*/
			File sourceFile = new File(sourceFilePath);
			File destnationFile = new File("C:/workspace_4413/rta/WebContent/image/userprofile/"+ name + ".jpg");
			FileUtils.copyFile(sourceFile, destnationFile);
			String dbi=name + ".jpg";
			
			String bimgname ="umesh";
			String bsourceFilePath = bimg.getAbsolutePath();
			/*System.out.println(sourceFilePath);*/
			File bsourceFile = new File(bsourceFilePath);
			File bdestnationFile = new File("C:/workspace_4413/rta/WebContent/image/userprofile/"+ name + "_b" +  ".jpg");
			FileUtils.copyFile(bsourceFile, bdestnationFile);
			String dbbi= name + "_b" +  ".jpg" ;
			
			String bsname ="umesh";
			String bssourceFilePath = b_sund.getAbsolutePath();
			/*System.out.println(sourceFilePath);*/
			File bssourceFile = new File(bssourceFilePath);
			File bsdestnationFile = new File("C:/workspace_4413/rta/WebContent/image/userprofile/"+ name + "_s" +  ".mp3");
			FileUtils.copyFile(bssourceFile, bsdestnationFile);
			String dbbs= name + "_s" +  ".mp4";
			
			st.executeUpdate("insert into reg_tbl(F_NAME,	L_NAME,	SEX,E_ID,PH,DOB,STATUS,PASS,SEQNO,SEQANS,COUN,STAT,DIST,CITY,ADDR,P_CODE,SCHOOL,COLLAGE,UNIVER,	WORK,LANG,F_MV,	F_SNG,F_BOOK,SENTENCE,IDLE,B_IMG,B_SOUND,I_PATH,GAME) values('"+firstname+"','"+lastname+"','"+sex+"','"+emailusr+"',"+phonenumber+",'"+dob+"','"+status+"','"+passwordusr+"',"+securityqid+" , '"+securityqans+"' , '"+country+"' , ' " + state+"' , '"+dist+"' , '"+city+"' , '"+address+"' , "+postcode+",'"+school+"','"+collage+"','"+uni+"','"+work+"','"+lang+"','"+mv+"','"+sng+"','"+book+"','"+sent+"','"+idl+"','"+dbbi+"','"+dbbs+"','"+dbi+"','"+gm+"')");
			
		}
		catch(Exception e){
			
			System.out.println("exception in dtb :" + e);
			//U_ID,	F_NAME,	L_NAME,	SEX,E_ID,PH,DOB,STATUS,PASS,SEQNO,SEQANS,COUN,STAT,DIST,CITY,ADDR,P_CODE,SCHOOL,COLLAGE,UNIVER,	WORK,LANG,F_MV,	F_SNG,F_BOOK,SENTENCE,IDLE,B_IMG,B_SOUND,I_PATH,GAME

		}
		return SUCCESS;
	}


	public File getBimg() {
		return bimg;
	}


	public void setBimg(File bimg) {
		this.bimg = bimg;
	}


	public File getB_sund() {
		return b_sund;
	}


	public void setB_sund(File b_sund) {
		this.b_sund = b_sund;
	}



}
