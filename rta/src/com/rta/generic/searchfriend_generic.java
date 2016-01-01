package com.rta.generic;

public class searchfriend_generic {

	int p_id;
	String fname ,lname,ipath,work;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getIpath() {
		return ipath;
	}
	public void setIpath(String ipath) {
		this.ipath = ipath;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
	searchfriend_generic(){
		
	}
	
	public searchfriend_generic(int p_id ,String fname ,String lname,String ipath,String work){
		this.p_id=p_id;
		this.fname=fname;
		this.lname=lname;
		this.ipath=ipath;
		this.work=work;
	}
}
