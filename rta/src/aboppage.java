import com.opensymphony.xwork2.ActionSupport;


public class aboppage extends ActionSupport {
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute()throws Exception{
		System.out.println("aboppage.java");
		System.out.println(name);
		return SUCCESS;
	}

}
