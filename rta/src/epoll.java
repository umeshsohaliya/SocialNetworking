import com.opensymphony.xwork2.ActionSupport;


public class epoll extends ActionSupport{
	public String iam;
	/**
	 * @return the iam
	 */
	public String getIam() {
		return iam;
	}
	/**
	 * @param iam the iam to set
	 */
	public void setIam(String iam) {
		this.iam = iam;
	}
	public String execute()throws Exception{
	System.out.println("epoll.java");
	System.out.println("this is :" + iam);
	return SUCCESS;
}
	
}
