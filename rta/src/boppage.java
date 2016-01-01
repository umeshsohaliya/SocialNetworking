import com.opensymphony.xwork2.ActionSupport;


public class boppage extends ActionSupport {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute()throws Exception{
		System.out.println("bop page.java");
		System.out.println(name);
		return SUCCESS;
	}

}
