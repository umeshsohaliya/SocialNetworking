import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class savepro extends ActionSupport{

	String   firstname;
	String   lastname;
	String sex;
	String	emailusr;
	String	phonenumber;
	String  status;
	String dob;
	
	String	passwordusr;
	
	String country;
	String state;
	String dist;
	String city;
	String address;
	int postcode;

	String school;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmailusr() {
		return emailusr;
	}

	public void setEmailusr(String emailusr) {
		this.emailusr = emailusr;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPasswordusr() {
		return passwordusr;
	}

	public void setPasswordusr(String passwordusr) {
		this.passwordusr = passwordusr;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getGm() {
		return gm;
	}

	public void setGm(String gm) {
		this.gm = gm;
	}

	public String getMv() {
		return mv;
	}

	public void setMv(String mv) {
		this.mv = mv;
	}

	public String getSng() {
		return sng;
	}

	public void setSng(String sng) {
		this.sng = sng;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getSent() {
		return sent;
	}

	public void setSent(String sent) {
		this.sent = sent;
	}

	public String getIdl() {
		return idl;
	}

	public void setIdl(String idl) {
		this.idl = idl;
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

	public File getImagefile() {
		return imagefile;
	}

	public void setImagefile(File imagefile) {
		this.imagefile = imagefile;
	}

	File bimg , comp;
	File b_sund;
	private File imagefile;
	
	public String execute() throws Exception{
		System.out.println("savepro.java   ");
		
		Map session=ActionContext.getContext().getSession();
		int name= (Integer) session.get("u_id");
		String imgname ="umesh";
		System.out.println(imagefile);
		
		try{
		String sourceFilePath = imagefile.getAbsolutePath();
		/*System.out.println(sourceFilePath);*/
		File sourceFile = new File(sourceFilePath);
		File destnationFile = new File("C:/workspace_4413/rta/WebContent/image/userprofile/"+ name + ".jpg");
		FileUtils.copyFile(sourceFile, destnationFile);
		}
		catch (Exception e) {
			System.out.println("profile picture not selected");
		}
		
		Connection con=com.rta.conne.conne.GetConnection();
		Statement st=con.createStatement();
		
		int id = (Integer) session.get("u_id");
		System.out.println(id);
		
		 st.executeUpdate("update reg_tbl set f_name=' " + firstname + " ' , l_name=' "+lastname+" ' ,sex = '"+sex+"',e_id ='"+emailusr+"',ph =  '"+phonenumber+"',dob='"+dob+"',status='"+status+"',pass='"+passwordusr+"',coun='"+country+"',stat='"+state+"' ,dist='"+dist+"',city='"+city+"',addr=' "+address+" ' ,p_code=' "+postcode+" ' ,school='"+school+"',collage='"+collage+"',univer='"+uni+"',work='"+work+"',lang='"+lang+"',f_mv='"+mv+"',f_sng='"+sng+"',f_book='"+book+"',sentence='"+sent+"',idle='"+idl+"',b_img='"+bimg+"',b_sound='"+b_sund+"',game='"+gm+"'  where u_id= "+id+" ");
		
		return SUCCESS;
	}
}
