package com.rta.generic;

public class fp_genric {

	String poll_name;
	int poll_id, poll_type , diff_level ;
	public String getPoll_name() {
		return poll_name;
	}
	public void setPoll_name(String poll_name) {
		this.poll_name = poll_name;
	}
	public int getPoll_id() {
		return poll_id;
	}
	public void setPoll_id(int poll_id) {
		this.poll_id = poll_id;
	}
	public int getPoll_type() {
		return poll_type;
	}
	public void setPoll_type(int poll_type) {
		this.poll_type = poll_type;
	}
	public int getDiff_level() {
		return diff_level;
	}
	public void setDiff_level(int diff_level) {
		this.diff_level = diff_level;
	}
	
	fp_genric(){
		
	}
	
	public fp_genric(int poll_id , String poll_name , int poll_type , int diff_level){
		
		this.poll_id= poll_id;
		this.poll_name = poll_name;
		this.poll_type = poll_type;
		this.diff_level =diff_level;
		
	}
}
