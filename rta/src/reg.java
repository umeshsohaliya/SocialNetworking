import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//import com.smartbid.controller.conne;


public class reg extends ActionSupport {
	
	//private String r_name;
	private String firstname;
	private String lastname;
	//private String sex;
	private String emailusr;
	private String phonenumber;
	//private String status;
	private String i_path;
	public String getI_path() {
		return i_path;
	}
	public void setI_path(String i_path) {
		this.i_path = i_path;
	}

	//private File i_path;
	private String passwordusr;
	private String securityqid;
	//private String securityqans;
	private String country;
	private String state;
	private String dist;
	private String city;
	private String address;
	private String postcode;
	/*
	private String school;
	private String collage;
	private String uni;
	private String work;
	private String lang;
	private String gn;
	private String mv;
	private String sng;
	private String book;
	private String sent;
	private String idl;
	private String b_img;
	private String b_sund;
	*/
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
	public String getEmailusr() {
		return emailusr;
	}
	public void setEmailusr(String emailusr) {
		this.emailusr = emailusr;
	}
	public String getPasswordusr() {
		return passwordusr;
	}
	public void setPasswordusr(String passwordusr) {
		this.passwordusr = passwordusr;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getSecurityqid() {
		return securityqid;
	}
	public void setSecurityqid(String securityqid) {
		this.securityqid = securityqid;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
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
	public String execute()throws Exception{
		System.out.println("abcd");
		try
		{
		//	Connection con=conne.GetConnection();
			/*Statement st=con.createStatement();
			System.out.println(firstname+lastname+companyname+emailusr+passwordusr+address1+address2+city+state+postcode+country+phonenumber+securityqid);
			String sql = "insert into registration_tbl(first_name,last_name,company_name,email_address,password,address1,address2,citystate,state_region,zip_code,country,phone_number,security_que) values('"+firstname+"','"+lastname+"','"+companyname+"','"+emailusr+"','"+passwordusr+"','"+address1+"','"+address2+"','"+city+"','"+state+"',"+postcode+",'"+country+"',"+phonenumber+",'"+securityqid+"'";
			st.executeUpdate(sql);*/
			
		/*	String sql = "insert into registration_tbl(first_name,last_name,email_address,password,address1,address2,citystate,zip_code,country,state_region,phone_number,security_que) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			java.sql.PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, firstname);
			ps.setString(2, lastname);

			ps.setString(3, emailusr);
			ps.setString(4, passwordusr);
			ps.setString(5,address);
			ps.setString(6,dist);
			ps.setString(7,city);
			
			ps.setInt(8,Integer.parseInt(postcode));
			ps.setString(9,country);
			ps.setString(10,state);
			ps.setLong(11,Long.parseLong(phonenumber));
			ps.setString(12,securityqid);
			ps.execute();
			*/
			System.out.println("hisdsssssssssssssss");
			
			Map session;
			session=ActionContext.getContext().getSession();
			session.put("username",firstname);
			session.put("u_id", firstname); 	
			session.put("i_patha", i_path);
			System.out.println(firstname);
			
			//session.put(firstname, lastname);
		}
		catch (Exception e) {
			System.out.println("exception in reg.java" + e);
		
			
		}
		return SUCCESS;
	}

}
