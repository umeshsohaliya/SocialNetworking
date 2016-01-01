import com.opensymphony.xwork2.ActionSupport;


public class epage extends ActionSupport {
	
String name;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public String execute()throws Exception{
		System.out.println("epage.java");
		System.out.println(name);
		return SUCCESS;
	}





}
